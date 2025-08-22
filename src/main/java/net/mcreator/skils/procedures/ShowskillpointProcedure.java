package net.mcreator.skils.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.skils.network.SkilsModVariables;

public class ShowskillpointProcedure {
	public static String execute(LevelAccessor world) {
		return SkilsModVariables.MapVariables.get(world).Skill_Point + "Skill Point";
	}
}