package com.github.unchama.seichiassist

import com.github.unchama.generic.tag.tag
import com.github.unchama.generic.tag.tag.@@
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.inventory.ItemStack

object MaterialSets {
  val fortuneMaterials: Set[Material] = Set(
    Material.COAL_ORE,
    Material.DIAMOND_ORE,
    Material.LAPIS_ORE,
    Material.EMERALD_ORE,
    Material.REDSTONE_ORE,
    Material.LEGACY_GLOWING_REDSTONE_ORE,
    Material.NETHER_QUARTZ_ORE
  )

  // このMaterialは整地スキルに対応する
  val materials: Set[Material] = Set(
    Material.STONE,
    Material.NETHERRACK,
    Material.NETHER_BRICK,
    Material.DIRT,
    Material.GRAVEL,
    Material.ACACIA_LOG,
    Material.BIRCH_LOG,
    Material.DARK_OAK_LOG,
    Material.JUNGLE_LOG,
    Material.OAK_LOG,
    Material.GRASS,
    Material.IRON_ORE,
    Material.GOLD_ORE,
    Material.SAND,
    Material.SANDSTONE,
    Material.END_STONE_BRICKS,
    Material.END_STONE,
    Material.ICE,
    Material.PACKED_ICE,
    Material.OBSIDIAN,
    Material.MAGMA_BLOCK,
    Material.SOUL_SAND,
    Material.OAK_LEAVES,
    Material.BIRCH_LEAVES,
    Material.JUNGLE_LEAVES,
    Material.ACACIA_LEAVES,
    Material.DARK_OAK_LEAVES,
    Material.SPRUCE_LEAVES,
    Material.CLAY,
    Material.BLACK_TERRACOTTA,
    Material.BLUE_TERRACOTTA,
    Material.BROWN_TERRACOTTA,
    Material.CYAN_TERRACOTTA,
    Material.GRAY_TERRACOTTA,
    Material.GREEN_TERRACOTTA,
    Material.LIGHT_BLUE_TERRACOTTA,
    Material.LIGHT_GRAY_TERRACOTTA,
    Material.LIME_TERRACOTTA,
    Material.MAGENTA_TERRACOTTA,
    Material.ORANGE_TERRACOTTA,
    Material.PINK_TERRACOTTA,
    Material.PURPLE_TERRACOTTA,
    Material.RED_TERRACOTTA,
    Material.WHITE_TERRACOTTA,
    Material.YELLOW_TERRACOTTA,
    Material.COBBLESTONE,
    Material.MOSSY_COBBLESTONE,
    Material.BLACK_GLAZED_TERRACOTTA,
    Material.BLUE_GLAZED_TERRACOTTA,
    Material.BROWN_GLAZED_TERRACOTTA,
    Material.CYAN_GLAZED_TERRACOTTA,
    Material.GRAY_GLAZED_TERRACOTTA,
    Material.GREEN_GLAZED_TERRACOTTA,
    Material.LIGHT_BLUE_GLAZED_TERRACOTTA,
    Material.LIGHT_GRAY_GLAZED_TERRACOTTA,
    Material.LIME_GLAZED_TERRACOTTA,
    Material.MAGENTA_GLAZED_TERRACOTTA,
    Material.ORANGE_GLAZED_TERRACOTTA,
    Material.PINK_GLAZED_TERRACOTTA,
    Material.PURPLE_GLAZED_TERRACOTTA,
    Material.RED_GLAZED_TERRACOTTA,
    Material.WHITE_GLAZED_TERRACOTTA,
    Material.YELLOW_GLAZED_TERRACOTTA,
    Material.LEGACY_MONSTER_EGGS,
    Material.COBWEB,
    Material.ACACIA_WOOD,
    Material.BIRCH_WOOD,
    Material.DARK_OAK_WOOD,
    Material.JUNGLE_WOOD,
    Material.OAK_WOOD,
    Material.OAK_FENCE,
    Material.ACACIA_FENCE,
    Material.BIRCH_FENCE,
    Material.DARK_OAK_FENCE,
    Material.JUNGLE_FENCE,
    Material.DARK_OAK_FENCE,
    Material.RAIL,
    Material.POWERED_RAIL,
    Material.DETECTOR_RAIL,
    Material.ACTIVATOR_RAIL,
    Material.MYCELIUM,
    Material.SNOW_BLOCK,
    Material.BROWN_MUSHROOM,
    Material.RED_MUSHROOM,
    Material.BONE_BLOCK,
    Material.PURPUR_BLOCK,
    Material.PURPUR_PILLAR,
    Material.SEA_LANTERN,
    Material.PRISMARINE,
    Material.STONE_BRICKS,
    Material.GLOWSTONE,
    Material.BLACK_STAINED_GLASS,
    Material.BLUE_STAINED_GLASS,
    Material.BROWN_STAINED_GLASS,
    Material.CYAN_STAINED_GLASS,
    Material.GRAY_STAINED_GLASS,
    Material.GREEN_STAINED_GLASS,
    Material.LIGHT_BLUE_STAINED_GLASS,
    Material.LIGHT_GRAY_STAINED_GLASS,
    Material.LIME_STAINED_GLASS,
    Material.MAGENTA_STAINED_GLASS,
    Material.ORANGE_STAINED_GLASS,
    Material.PINK_STAINED_GLASS,
    Material.PURPLE_STAINED_GLASS,
    Material.RED_STAINED_GLASS,
    Material.WHITE_STAINED_GLASS,
    Material.YELLOW_STAINED_GLASS,
    Material.BLACK_STAINED_GLASS_PANE,
    Material.BLUE_STAINED_GLASS_PANE,
    Material.BROWN_STAINED_GLASS_PANE,
    Material.CYAN_STAINED_GLASS_PANE,
    Material.GRAY_STAINED_GLASS_PANE,
    Material.GREEN_STAINED_GLASS_PANE,
    Material.LIGHT_BLUE_STAINED_GLASS_PANE,
    Material.LIGHT_GRAY_STAINED_GLASS_PANE,
    Material.LIME_STAINED_GLASS_PANE,
    Material.MAGENTA_STAINED_GLASS_PANE,
    Material.ORANGE_STAINED_GLASS_PANE,
    Material.PINK_STAINED_GLASS_PANE,
    Material.PURPLE_STAINED_GLASS_PANE,
    Material.RED_STAINED_GLASS_PANE,
    Material.WHITE_STAINED_GLASS_PANE,
    Material.YELLOW_STAINED_GLASS_PANE,
    Material.GLASS,
    Material.ACACIA_STAIRS,
    Material.BIRCH_STAIRS,
    Material.BRICK_STAIRS,
    Material.DARK_OAK_STAIRS,
    Material.NETHER_BRICK_STAIRS,
    Material.PURPUR_STAIRS,
    Material.QUARTZ_STAIRS,
    Material.SANDSTONE_STAIRS,
    Material.STONE_BRICK_STAIRS,
    Material.ACACIA_STAIRS,
    Material.DARK_OAK_STAIRS,
    Material.BIRCH_FENCE,
    Material.SPRUCE_FENCE,
    Material.ACACIA_FENCE,
    Material.BIRCH_FENCE_GATE,
    Material.SPRUCE_FENCE_GATE,
    Material.ACACIA_FENCE_GATE,
    Material.DARK_OAK_FENCE_GATE,
    Material.COBBLESTONE_STAIRS,
    Material.SANDSTONE_STAIRS,
    Material.BRICK_STAIRS,
    Material.QUARTZ_STAIRS,
    Material.BOOKSHELF,
    Material.ICE,
    Material.BLACK_WOOL,
    Material.BLUE_WOOL,
    Material.BROWN_WOOL,
    Material.CYAN_WOOL,
    Material.GRAY_WOOL,
    Material.GREEN_WOOL,
    Material.LIGHT_BLUE_WOOL,
    Material.LIGHT_GRAY_WOOL,
    Material.LIME_WOOL,
    Material.MAGENTA_WOOL,
    Material.ORANGE_WOOL,
    Material.PINK_WOOL,
    Material.PURPLE_WOOL,
    Material.RED_WOOL,
    Material.WHITE_WOOL,
    Material.YELLOW_WOOL,
    Material.GOLD_BLOCK,
    Material.END_ROD,
    Material.PUMPKIN,
    Material.MELON,
    Material.RED_SANDSTONE_SLAB,
    Material.SPONGE,
    Material.FARMLAND,
    Material.GRASS_PATH,
    Material.SPAWNER,
    Material.CRAFTING_TABLE,
    Material.FURNACE,
    Material.QUARTZ_BLOCK,
    Material.CHEST,
    Material.TRAPPED_CHEST,
    Material.NETHER_BRICK_FENCE,
    Material.NETHER_BRICK_STAIRS,
    Material.CAULDRON,
    Material.END_ROD,
    Material.PURPUR_STAIRS,
    Material.END_STONE_BRICKS,
    Material.PURPUR_SLAB,
    Material.ENDER_CHEST,
    Material.PURPUR_SLAB,
    Material.STONE_SLAB,
    Material.NETHER_BRICK_SLAB,
    Material.COBBLESTONE_SLAB,
    Material.END_PORTAL_FRAME,
    Material.END_PORTAL,
    Material.VINE,
    Material.BLACK_BED,
    Material.BLUE_BED,
    Material.BROWN_BED,
    Material.CYAN_BED,
    Material.GRAY_BED,
    Material.GREEN_BED,
    Material.LIGHT_BLUE_BED,
    Material.LIGHT_GRAY_BED,
    Material.LIME_BED,
    Material.MAGENTA_BED,
    Material.ORANGE_BED,
    Material.PINK_BED,
    Material.PURPLE_BED,
    Material.RED_BED,
    Material.WHITE_BED,
    Material.YELLOW_BED,
    Material.BIRCH_TRAPDOOR,
    Material.OAK_TRAPDOOR,
    Material.ACACIA_TRAPDOOR,
    Material.JUNGLE_TRAPDOOR,
    Material.DARK_OAK_TRAPDOOR,
    Material.IRON_TRAPDOOR,
    Material.BLACK_CARPET,
    Material.BLUE_CARPET,
    Material.BROWN_CARPET,
    Material.CYAN_CARPET,
    Material.GRAY_CARPET,
    Material.GREEN_CARPET,
    Material.LIGHT_BLUE_CARPET,
    Material.LIGHT_GRAY_CARPET,
    Material.LIME_CARPET,
    Material.MAGENTA_CARPET,
    Material.ORANGE_CARPET,
    Material.PINK_CARPET,
    Material.PURPLE_CARPET,
    Material.RED_CARPET,
    Material.WHITE_CARPET,
    Material.YELLOW_CARPET,
    Material.IRON_DOOR,
    Material.OAK_DOOR,
    Material.ACACIA_DOOR,
    Material.BIRCH_DOOR,
    Material.DARK_OAK_DOOR,
    Material.JUNGLE_DOOR,
    Material.SPRUCE_DOOR,
    Material.STONE_BRICK_STAIRS,
    Material.BREWING_STAND,
    Material.ACACIA_SLAB,
    Material.BIRCH_SLAB,
    Material.DARK_OAK_SLAB,
    Material.JUNGLE_SLAB,
    Material.OAK_SLAB,
    Material.TNT,
    Material.DISPENSER,
    Material.STICKY_PISTON
  ) ++ fortuneMaterials

  // これらのマテリアルを持つブロックは破壊を整地量に計上しない
  val exclude: Set[Material] = Set(
    Material.GRASS_PATH,
    Material.FARMLAND,
    Material.SPAWNER,
    Material.CAULDRON,
    Material.ENDER_CHEST,
    Material.END_PORTAL_FRAME,
    Material.END_PORTAL
  )

  val materialsToCountBlockBreak: Set[Material] = materials -- exclude

  /**
   * これらのマテリアルを用いてブロックの破壊試行を行う。
   *
   * 整地スキル使用時のブロックから取れるアイテムは、 プレーヤーの使用ツールのマテリアルをこれらに張り替えた時のドロップのmaxとして計算される。
   *
   * 例えば石をシャベルで掘った時にも、ツールのエンチャントを保ったままダイヤツルハシで掘ったものとして計算し、 結果得られるスタック数が最大のものが結果として採用される。
   */
  val breakTestToolMaterials: Seq[Material] =
    Seq(Material.DIAMOND_PICKAXE, Material.DIAMOND_AXE, Material.DIAMOND_SHOVEL)

  val breakToolMaterials: Set[Material] = Set(
    Material.WOODEN_PICKAXE,
    Material.WOODEN_SHOVEL,
    Material.STONE_PICKAXE,
    Material.STONE_AXE,
    Material.STONE_SHOVEL,
    Material.IRON_PICKAXE,
    Material.IRON_AXE,
    Material.IRON_SHOVEL,
    Material.GOLDEN_PICKAXE,
    Material.GOLDEN_AXE,
    Material.GOLDEN_SHOVEL
  ) ++ breakTestToolMaterials

  val cancelledMaterials: Set[Material] = Set(
    Material.CHEST,
    Material.ENDER_CHEST,
    Material.TRAPPED_CHEST,
    Material.ANVIL,
    Material.ARMOR_STAND,
    Material.BEACON,
    Material.BIRCH_DOOR,
    Material.BIRCH_FENCE_GATE,
    Material.BIRCH_STAIRS,
    Material.BIRCH_BOAT,
    Material.OAK_BOAT,
    Material.ACACIA_BOAT,
    Material.JUNGLE_BOAT,
    Material.DARK_OAK_BOAT,
    Material.SPRUCE_BOAT,
    Material.FURNACE,
    Material.CRAFTING_TABLE,
    Material.HOPPER,
    Material.MINECART
  )

  val transparentMaterials: Set[Material] = Set(Material.BEDROCK, Material.AIR)

  val gravityMaterials: Set[Material] =
    Set(
      Material.ACACIA_LOG,
      Material.BIRCH_LOG,
      Material.DARK_OAK_LOG,
      Material.JUNGLE_LOG,
      Material.OAK_LOG,
      Material.OAK_LEAVES,
      Material.BIRCH_LEAVES,
      Material.JUNGLE_LEAVES,
      Material.ACACIA_LEAVES,
      Material.DARK_OAK_LEAVES,
      Material.SPRUCE_LEAVES
    )

  trait MaterialOf[S <: Set[Material]]

  type ItemStackOf[S <: Set[Material]] = ItemStack @@ MaterialOf[S]
  type BlockOf[S <: Set[Material]] = Block @@ MaterialOf[S]

  type BreakTool = ItemStackOf[breakToolMaterials.type]
  type BlockBreakableBySkill = BlockOf[materials.type]

  def refineItemStack(
    stack: ItemStack,
    set: collection.immutable.Set[Material]
  ): Option[ItemStackOf[set.type]] =
    if (set.contains(stack.getType))
      Some(tag.apply[MaterialOf[set.type]][ItemStack](stack))
    else
      None

  def refineBlock(
    block: Block,
    set: collection.immutable.Set[Material]
  ): Option[BlockOf[set.type]] =
    if (set.contains(block.getType))
      Some(tag.apply[MaterialOf[set.type]][Block](block))
    else
      None
}
