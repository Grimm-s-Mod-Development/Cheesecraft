/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.cheesecraft.init;

import org.gsdistance.obx.cheesecraft.item.*;
import org.gsdistance.obx.cheesecraft.CheesecraftMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

public class CheesecraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CheesecraftMod.MODID);
	public static final DeferredItem<Item> COMPRESSED_COAL_BLOCK;
	public static final DeferredItem<Item> MORE_COMPRESSED_COAL_BLOCK;
	public static final DeferredItem<Item> MORE_COMPRESSED_COAL_BLOCK_PLUS;
	public static final DeferredItem<Item> PLACEHOLDERCURSEDTECHNIUQE_67_CAUSESPEOPLETOCOMMITSUICIDE;
	public static final DeferredItem<Item> FLINT_PICKAXE;
	public static final DeferredItem<Item> FLINT_AXE;
	public static final DeferredItem<Item> FLINT_SWORD;
	public static final DeferredItem<Item> FLINT_SHOVEL;
	public static final DeferredItem<Item> FLINT_HOE;
	public static final DeferredItem<Item> FLINT_ARMOR_HELMET;
	public static final DeferredItem<Item> FLINT_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> FLINT_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> FLINT_ARMOR_BOOTS;
	public static final DeferredItem<Item> FLINT_KNIFE;
	public static final DeferredItem<Item> STONE_ARMOR_HELMET;
	public static final DeferredItem<Item> STONE_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> STONE_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> STONE_ARMOR_BOOTS;
	public static final DeferredItem<Item> STONE_KNIFE;
	public static final DeferredItem<Item> IRON_KNIFE;
	public static final DeferredItem<Item> DIAMOND_KNIFE;
	public static final DeferredItem<Item> NETHERITE_KNIFE;
	public static final DeferredItem<Item> REDSTONE_PICKAXE;
	public static final DeferredItem<Item> REDSTONE_AXE;
	public static final DeferredItem<Item> REDSTONE_SWORD;
	public static final DeferredItem<Item> REDSTONE_SHOVEL;
	public static final DeferredItem<Item> REDSTONE_HOE;
	public static final DeferredItem<Item> REDSTONE_ARMOR_HELMET;
	public static final DeferredItem<Item> REDSTONE_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> REDSTONE_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> REDSTONE_ARMOR_BOOTS;
	static {
		COMPRESSED_COAL_BLOCK = block(CheesecraftModBlocks.COMPRESSED_COAL_BLOCK);
		MORE_COMPRESSED_COAL_BLOCK = block(CheesecraftModBlocks.MORE_COMPRESSED_COAL_BLOCK);
		MORE_COMPRESSED_COAL_BLOCK_PLUS = block(CheesecraftModBlocks.MORE_COMPRESSED_COAL_BLOCK_PLUS);
		PLACEHOLDERCURSEDTECHNIUQE_67_CAUSESPEOPLETOCOMMITSUICIDE = register("placeholdercursedtechniuqe_67_causespeopletocommitsuicide", PLACEHOLDERCURSEDTECHNIUQE67CAUSESPEOPLETOCOMMITSUICIDEItem::new);
		FLINT_PICKAXE = register("flint_pickaxe", FlintPickaxeItem::new);
		FLINT_AXE = register("flint_axe", FlintAxeItem::new);
		FLINT_SWORD = register("flint_sword", FlintSwordItem::new);
		FLINT_SHOVEL = register("flint_shovel", FlintShovelItem::new);
		FLINT_HOE = register("flint_hoe", FlintHoeItem::new);
		FLINT_ARMOR_HELMET = register("flint_armor_helmet", FlintArmorItem.Helmet::new);
		FLINT_ARMOR_CHESTPLATE = register("flint_armor_chestplate", FlintArmorItem.Chestplate::new);
		FLINT_ARMOR_LEGGINGS = register("flint_armor_leggings", FlintArmorItem.Leggings::new);
		FLINT_ARMOR_BOOTS = register("flint_armor_boots", FlintArmorItem.Boots::new);
		FLINT_KNIFE = register("flint_knife", FlintKnifeItem::new);
		STONE_ARMOR_HELMET = register("stone_armor_helmet", StoneArmorItem.Helmet::new);
		STONE_ARMOR_CHESTPLATE = register("stone_armor_chestplate", StoneArmorItem.Chestplate::new);
		STONE_ARMOR_LEGGINGS = register("stone_armor_leggings", StoneArmorItem.Leggings::new);
		STONE_ARMOR_BOOTS = register("stone_armor_boots", StoneArmorItem.Boots::new);
		STONE_KNIFE = register("stone_knife", StoneKnifeItem::new);
		IRON_KNIFE = register("iron_knife", IronKnifeItem::new);
		DIAMOND_KNIFE = register("diamond_knife", DiamondKnifeItem::new);
		NETHERITE_KNIFE = register("netherite_knife", NetheriteKnifeItem::new);
		REDSTONE_PICKAXE = register("redstone_pickaxe", RedstonePickaxeItem::new);
		REDSTONE_AXE = register("redstone_axe", RedstoneAxeItem::new);
		REDSTONE_SWORD = register("redstone_sword", RedstoneSwordItem::new);
		REDSTONE_SHOVEL = register("redstone_shovel", RedstoneShovelItem::new);
		REDSTONE_HOE = register("redstone_hoe", RedstoneHoeItem::new);
		REDSTONE_ARMOR_HELMET = register("redstone_armor_helmet", RedstoneArmorItem.Helmet::new);
		REDSTONE_ARMOR_CHESTPLATE = register("redstone_armor_chestplate", RedstoneArmorItem.Chestplate::new);
		REDSTONE_ARMOR_LEGGINGS = register("redstone_armor_leggings", RedstoneArmorItem.Leggings::new);
		REDSTONE_ARMOR_BOOTS = register("redstone_armor_boots", RedstoneArmorItem.Boots::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}