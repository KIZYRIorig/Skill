package net.mcreator.skils.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.skils.network.SkilsModVariables;

public class BuyskillpointProcedure {
	public static void execute(LevelAccessor world) {
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 50000) {
			SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 50000;
			SkilsModVariables.MapVariables.get(world).syncData(world);
			SkilsModVariables.MapVariables.get(world).Skill_Point = SkilsModVariables.MapVariables.get(world).Skill_Point + 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
	}
}