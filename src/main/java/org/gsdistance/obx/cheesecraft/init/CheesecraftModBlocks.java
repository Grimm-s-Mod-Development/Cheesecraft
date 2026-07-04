/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.cheesecraft.init;

import org.gsdistance.obx.cheesecraft.block.MoreCompressedCoalBlockPlusBlock;
import org.gsdistance.obx.cheesecraft.block.MoreCompressedCoalBlockBlock;
import org.gsdistance.obx.cheesecraft.block.CompressedCoalBlockBlock;
import org.gsdistance.obx.cheesecraft.CheesecraftMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class CheesecraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CheesecraftMod.MODID);
	public static final DeferredBlock<Block> COMPRESSED_COAL_BLOCK;
	public static final DeferredBlock<Block> MORE_COMPRESSED_COAL_BLOCK;
	public static final DeferredBlock<Block> MORE_COMPRESSED_COAL_BLOCK_PLUS;
	static {
		COMPRESSED_COAL_BLOCK = register("compressed_coal_block", CompressedCoalBlockBlock::new);
		MORE_COMPRESSED_COAL_BLOCK = register("more_compressed_coal_block", MoreCompressedCoalBlockBlock::new);
		MORE_COMPRESSED_COAL_BLOCK_PLUS = register("more_compressed_coal_block_plus", MoreCompressedCoalBlockPlusBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}