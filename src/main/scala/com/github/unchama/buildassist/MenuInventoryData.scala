package com.github.unchama.buildassist

import com.github.unchama.itemstackbuilder.{IconItemStackBuilder, SkullItemStackBuilder}
import com.github.unchama.seichiassist.SkullOwners
import com.github.unchama.seichiassist.util.AsyncInventorySetter
import org.bukkit.ChatColor._
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.{Bukkit, Material}

object MenuInventoryData {

  def getSetBlockSkillData(p: Player): Inventory = {
    //プレイヤーを取得
    val player = p.getPlayer
    //UUID取得
    val uuid = player.getUniqueId
    //プレイヤーデータ
    val playerdata = BuildAssist.instance.temporaryData(uuid)

    val inventory = Bukkit.getServer.createInventory(null, 4 * 9, s"$DARK_PURPLE$BOLD「範囲設置スキル」設定画面")

    val rectFillEnabledStr = if (playerdata.rectFillEnabled) {
      "ON"
    } else {
      "OFF"
    }

    val rectFillIncludeUnderCavesStr = if (playerdata.rectFillIncludeUnderCaves) {
      "ON"
    } else {
      "OFF"
    }

    val rectFillPrioritizeMineStackStr = if (playerdata.rectFillPrioritizeMineStack) {
      "ON"
    } else {
      "OFF"
    }

    val rectangleFillRangeStep = playerdata.rectFillRangeStep * 2 + 1

    val mapping = Map(
      //初期画面へ移動
      0 -> {
        new IconItemStackBuilder(Material.BARRIER)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}元のページへ")
          .lore(
            s"$RESET$DARK_RED${UNDERLINE}クリックで移動"
          )
          .build()
      },

      //土設置のON/OFF
      4 -> {
        new IconItemStackBuilder(Material.DIRT)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}設置時に下の空洞を埋める機能")
          .lore(
            s"$RESET$AQUA${UNDERLINE}機能の使用設定：$rectFillIncludeUnderCavesStr",
            s"$RESET$AQUA${UNDERLINE}機能の範囲：地下5マスまで"
          )
          .build()
      },

      //設定状況の表示
      13 -> {
        new IconItemStackBuilder(Material.STONE)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}現在の設定は以下の通りです")
          .lore(
            s"$RESET$AQUA${UNDERLINE}スキルの使用設定：$rectFillEnabledStr",
            s"$RESET$AQUA${UNDERLINE}スキルの範囲設定：$rectangleFillRangeStep×$rectangleFillRangeStep",
            s"$RESET$AQUA${UNDERLINE}MineStack優先設定:$rectFillPrioritizeMineStackStr"
          )
          .build()
      },

      //範囲をMAXへ
      19 -> {
        new SkullItemStackBuilder(SkullOwners.MHF_ArrowUp)
          .amount(11)
          .title(s"$RED$UNDERLINE${BOLD}範囲設定を最大値に変更")
          .lore(
            s"$RESET${AQUA}現在の範囲設定：$rectangleFillRangeStep×$rectangleFillRangeStep",
            // TODO: UIにハードコーディングされているがこれをconfigurableに
            s"$RESET$AQUA${UNDERLINE}変更後の範囲設定：11×11"
          )
          .build()
      },

      //範囲を一段階増加
      20 -> {
        new SkullItemStackBuilder(SkullOwners.MHF_ArrowUp)
          .amount(7)
          .title(s"$YELLOW$UNDERLINE${BOLD}範囲設定を一段階大きくする")
          .lore(
            s"$RESET${AQUA}現在の範囲設定：$rectangleFillRangeStep×$rectangleFillRangeStep",
            s"$RESET$AQUA${UNDERLINE}変更後の範囲設定：${rectangleFillRangeStep + 2}×${rectangleFillRangeStep + 2}",
            s"$RESET$RED※範囲設定の最大値は11×11※"
          )
          .build()
      },

      //範囲を初期値へ
      22 -> {
        new SkullItemStackBuilder("MHF_TNT")
          .amount(5)
          .title(s"$RED$UNDERLINE${BOLD}範囲設定を初期値に変更")
          .lore(
            s"$RESET${AQUA}現在の範囲設定：$rectangleFillRangeStep×$rectangleFillRangeStep",
            s"$RESET$AQUA${UNDERLINE}変更後の範囲設定：5×5"
          )
          .build()
      },

      //範囲を一段階減少
      24 -> {
        new SkullItemStackBuilder(SkullOwners.MHF_ArrowDown)
          .amount(3)
          .title(s"$YELLOW$UNDERLINE${BOLD}範囲設定を一段階小さくする")
          .lore(
            s"$RESET${AQUA}現在の範囲設定：$rectangleFillRangeStep×$rectangleFillRangeStep",
            s"$RESET$AQUA${UNDERLINE}変更後の範囲設定：${rectangleFillRangeStep - 2}×${rectangleFillRangeStep - 2}",
            s"$RESET$RED※範囲設定の最小値は3×3※"
          )
          .build()
      },

      //範囲をMINへ
      25 -> {
        new SkullItemStackBuilder(SkullOwners.MHF_ArrowDown)
          .amount(1)
          .title(s"$RED$UNDERLINE${BOLD}範囲設定を最小値に変更")
          .lore(
            s"$RESET${AQUA}現在の範囲設定：$rectangleFillRangeStep×$rectangleFillRangeStep",
            s"$RESET$AQUA${UNDERLINE}変更後の範囲設定：3×3"
          )
          .build()
      },

      //35番目にMineStack優先設定を追加
      //MineStackの方を優先して消費する設定
      35 -> {
        new IconItemStackBuilder(Material.CHEST)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}MineStack優先設定：$rectFillPrioritizeMineStackStr")
          .lore(
            s"$RESET${GRAY}スキルでブロックを並べるとき",
            s"$RESET${GRAY}MineStackの在庫を優先して消費します。",
            s"$RESET${GRAY}建築Lv${BuildAssist.config.getRectangleFillFromMineStackUnlockLevel}以上で利用可能",
            s"$RESET${GRAY}クリックで切り替え"
          )
          .build()
      }
    )
    mapping.foreach { case (index, item) =>
      AsyncInventorySetter.setItemAsync(inventory, index, item)
    }
    inventory
  }

  //ブロックを並べる設定メニュー
  def getBlockLineUpData(p: Player): Inventory = {
    //プレイヤーを取得
    val player = p.getPlayer
    //UUID取得
    val uuid = player.getUniqueId
    //プレイヤーデータ
    val playerdata = BuildAssist.instance.temporaryData(uuid)

    val inventory = Bukkit.getServer.createInventory(null, 4 * 9, s"$DARK_PURPLE$BOLD「直列設置」設定")

    val mapping = Map(
      // ホームを開く
      27 -> {
        new SkullItemStackBuilder(SkullOwners.MHF_ArrowLeft)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}ホームへ")
          .lore(
            s"$RESET$DARK_RED${UNDERLINE}クリックで移動"
          )
          .build()
      },
      //直列設置設定
      0 -> {
        new IconItemStackBuilder(Material.WOOD)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}直列設置 ：${BuildAssist.lineFillStateDescriptions(playerdata.lineFillStatus)}")
          .lore(
            s"$RESET${GRAY}オフハンドに木の棒、メインハンドに設置したいブロックを持って",
            s"$RESET${GRAY}左クリックすると向いてる方向に並べて設置します。",
            s"$RESET${GRAY}建築Lv${BuildAssist.config.getLineFillUnlockLevel}以上で利用可能",
            s"$RESET${GRAY}クリックで切り替え"
          )
          .build()
      },
      //直列設置ハーフブロック設定
      1 -> {
        new IconItemStackBuilder(Material.STEP)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}ハーフブロック設定 ：${BuildAssist.lineFillSlabPositionDescriptions(playerdata.lineFillSlabPosition)}")
          .lore(
            s"$RESET${GRAY}ハーフブロックを並べる時の位置を決めます。",
            s"$RESET${GRAY}クリックで切り替え"
          )
          .build()
      },
      //直列設置一部ブロックを破壊して並べる設定
      2 -> {
        new IconItemStackBuilder(Material.TNT)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}破壊設定 ：${BuildAssist.asDescription(playerdata.lineFillDestructWeakBlocks)}")
          .lore(
            s"$RESET${GRAY}ブロックを並べるとき特定のブロックを破壊して並べます。",
            s"$RESET${GRAY}破壊対象ブロック：草,花,水,雪,松明,きのこ",
            s"$RESET${GRAY}クリックで切り替え"
          )
          .build()
      },
      //MineStackの方を優先して消費する設定
      8 -> {
        new IconItemStackBuilder(Material.CHEST)
          .amount(1)
          .title(s"$YELLOW$UNDERLINE${BOLD}MineStack優先設定 ：${BuildAssist.asDescription(playerdata.lineFillPrioritizeMineStack)}")
          .lore(
            s"$RESET${GRAY}スキルでブロックを並べるとき",
            s"$RESET${GRAY}MineStackの在庫を優先して消費します。",
            s"$RESET${GRAY}建築Lv${BuildAssist.config.getLineFillFromMineStackUnlockLevel}以上で利用可能",
            s"$RESET${GRAY}クリックで切り替え"
          )
          .build()
      },
    )
    mapping.foreach { case (index, item) =>
      AsyncInventorySetter.setItemAsync(inventory, index, item)
    }
    inventory
  }
}
