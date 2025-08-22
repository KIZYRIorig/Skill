package net.mcreator.skils.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.skils.network.SkilsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveexpProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getState());
	}

	public static void execute(LevelAccessor world, BlockState blockstate) {
		execute(null, world, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, BlockState blockstate) {
		if (blockstate == Blocks.STONE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.ANDESITE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DIORITE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.GRANITE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.CALCITE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.TUFF.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.BLACKSTONE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.SANDSTONE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.GRASS_BLOCK.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.MUD.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.AMETHYST_BLOCK.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.OBSIDIAN.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 200;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.SAND.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.RED_SAND.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.RED_SANDSTONE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.COAL_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 5;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.IRON_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 10;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.REDSTONE_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 7;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.LAPIS_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 7;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.COPPER_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 3;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DIAMOND_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 150;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.EMERALD_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 300;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.GOLD_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 50;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.NETHER_QUARTZ_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 25;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.NETHER_GOLD_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 15;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE_COAL_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 5;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE_IRON_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 10;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 7;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 7;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 3;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 150;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 300;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.OAK_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.SPRUCE_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.BIRCH_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.JUNGLE_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.ACACIA_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.DARK_OAK_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.WARPED_STEM.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.CRIMSON_STEM.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.MANGROVE_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
		if (blockstate == Blocks.CHERRY_LOG.defaultBlockState()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 20;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
	}
}