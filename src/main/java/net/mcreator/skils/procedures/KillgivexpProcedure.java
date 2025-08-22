package net.mcreator.skils.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.skils.network.SkilsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KillgivexpProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive()) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp + 2;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
	}
}