/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skils.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.skils.block.BlcksBlock;
import net.mcreator.skils.SkilsMod;

public class SkilsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SkilsMod.MODID);
	public static final RegistryObject<Block> BLCKS = REGISTRY.register("blcks", () -> new BlcksBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}