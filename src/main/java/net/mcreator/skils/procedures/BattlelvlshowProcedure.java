package net.mcreator.skils.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.skils.network.SkilsModVariables;

public class BattlelvlshowProcedure {
	public static String execute(LevelAccessor world) {
		return SkilsModVariables.MapVariables.get(world).battle_lvl + "\u0423\u0440\u043E\u0432\u0435\u043D\u044C";
	}
}