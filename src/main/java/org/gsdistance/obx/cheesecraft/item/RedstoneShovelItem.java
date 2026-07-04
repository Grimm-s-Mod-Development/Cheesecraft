package org.gsdistance.obx.cheesecraft.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedstoneShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 95, 4f, 0, 7, TagKey.create(Registries.ITEM, ResourceLocation.parse("cheesecraft:redstone_shovel_repair_items")));

	public RedstoneShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -3f, properties);
	}
}