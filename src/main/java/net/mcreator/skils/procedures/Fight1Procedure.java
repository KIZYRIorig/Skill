package net.mcreator.skils.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.skils.network.SkilsModVariables;

public class Fight1Procedure {
	public static void execute(LevelAccessor world) {
		if (SkilsModVariables.MapVariables.get(world).Skill_Point >= 1) {
			SkilsModVariables.MapVariables.get(world).Skill_Point = SkilsModVariables.MapVariables.get(world).Skill_Point - 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
			SkilsModVariables.MapVariables.get(world).skill_fight1 = 1;
			SkilsModVariables.MapVariables.get(world).syncData(world);
		}
	}
}