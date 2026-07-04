package org.gsdistance.obx.cheesecraft.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedstoneSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 95, 4f, 0, 7, TagKey.create(Registries.ITEM, ResourceLocation.parse("cheesecraft:redstone_sword_repair_items")));

	public RedstoneSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 2f, -3f));
	}
}