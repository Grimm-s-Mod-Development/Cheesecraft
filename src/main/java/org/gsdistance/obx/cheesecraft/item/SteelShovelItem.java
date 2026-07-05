package org.gsdistance.obx.cheesecraft.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SteelShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 441, 8f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("cheesecraft:steel_shovel_repair_items")));

	public SteelShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, -2f, properties);
	}
}