package org.gsdistance.obx.cheesecraft.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class FlintHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 10, 2f, 0, 1, TagKey.create(Registries.ITEM, ResourceLocation.parse("cheesecraft:flint_hoe_repair_items")));

	public FlintHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, -1f, -4f, properties);
	}
}