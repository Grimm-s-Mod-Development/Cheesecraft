/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.cheesecraft.init;

import org.gsdistance.obx.cheesecraft.CheesecraftMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class CheesecraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CheesecraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CHEESE_CRAFT = REGISTRY.register("cheese_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cheesecraft.cheese_craft")).icon(() -> new ItemStack(Items.HEART_OF_THE_SEA)).displayItems((parameters, tabData) -> {
				tabData.accept(CheesecraftModBlocks.COMPRESSED_COAL_BLOCK.get().asItem());
				tabData.accept(CheesecraftModBlocks.MORE_COMPRESSED_COAL_BLOCK.get().asItem());
				tabData.accept(CheesecraftModBlocks.MORE_COMPRESSED_COAL_BLOCK_PLUS.get().asItem());
				tabData.accept(CheesecraftModItems.PLACEHOLDERCURSEDTECHNIUQE_67_CAUSESPEOPLETOCOMMITSUICIDE.get());
				tabData.accept(CheesecraftModItems.FLINT_PICKAXE.get());
				tabData.accept(CheesecraftModItems.FLINT_AXE.get());
				tabData.accept(CheesecraftModItems.FLINT_SWORD.get());
				tabData.accept(CheesecraftModItems.FLINT_SHOVEL.get());
				tabData.accept(CheesecraftModItems.FLINT_HOE.get());
				tabData.accept(CheesecraftModItems.FLINT_ARMOR_HELMET.get());
				tabData.accept(CheesecraftModItems.FLINT_ARMOR_CHESTPLATE.get());
				tabData.accept(CheesecraftModItems.FLINT_ARMOR_LEGGINGS.get());
				tabData.accept(CheesecraftModItems.FLINT_ARMOR_BOOTS.get());
				tabData.accept(CheesecraftModItems.FLINT_KNIFE.get());
				tabData.accept(CheesecraftModItems.STONE_ARMOR_HELMET.get());
				tabData.accept(CheesecraftModItems.STONE_ARMOR_CHESTPLATE.get());
				tabData.accept(CheesecraftModItems.STONE_ARMOR_LEGGINGS.get());
				tabData.accept(CheesecraftModItems.STONE_ARMOR_BOOTS.get());
				tabData.accept(CheesecraftModItems.STONE_KNIFE.get());
				tabData.accept(CheesecraftModItems.IRON_KNIFE.get());
				tabData.accept(CheesecraftModItems.DIAMOND_KNIFE.get());
				tabData.accept(CheesecraftModItems.NETHERITE_KNIFE.get());
				tabData.accept(CheesecraftModItems.REDSTONE_PICKAXE.get());
				tabData.accept(CheesecraftModItems.REDSTONE_AXE.get());
				tabData.accept(CheesecraftModItems.REDSTONE_SWORD.get());
				tabData.accept(CheesecraftModItems.REDSTONE_SHOVEL.get());
				tabData.accept(CheesecraftModItems.REDSTONE_HOE.get());
				tabData.accept(CheesecraftModItems.REDSTONE_ARMOR_HELMET.get());
				tabData.accept(CheesecraftModItems.REDSTONE_ARMOR_CHESTPLATE.get());
				tabData.accept(CheesecraftModItems.REDSTONE_ARMOR_LEGGINGS.get());
				tabData.accept(CheesecraftModItems.REDSTONE_ARMOR_BOOTS.get());
			}).build());
}