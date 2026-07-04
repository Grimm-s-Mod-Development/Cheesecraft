package org.gsdistance.obx.cheesecraft.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class FlintSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 10, 2f, 0, 1, TagKey.create(Registries.ITEM, ResourceLocation.parse("cheesecraft:flint_sword_repair_items")));

	public FlintSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 0f, -4f));
	}
}