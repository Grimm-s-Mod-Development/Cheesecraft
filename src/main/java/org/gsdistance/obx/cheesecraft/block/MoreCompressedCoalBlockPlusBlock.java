package org.gsdistance.obx.cheesecraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MoreCompressedCoalBlockPlusBlock extends Block {
	public MoreCompressedCoalBlockPlusBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f));
	}
}