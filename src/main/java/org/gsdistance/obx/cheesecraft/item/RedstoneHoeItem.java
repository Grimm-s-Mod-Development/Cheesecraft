package org.gsdistance.obx.cheesecraft.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedstoneHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 95, 4f, 0, 7, TagKey.create(Registries.ITEM, ResourceLocation.parse("cheesecraft:redstone_hoe_repair_items")));

	public RedstoneHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -2f, properties);
	}
}