package net.mcreator.skils.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.skils.network.SkilsModVariables;

public class BattlelvlupProcedure {
	public static void execute(LevelAccessor world) {
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 2000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 1) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 2000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 4000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 2) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 4000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 6000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 3) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 6000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 8000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 4) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 8000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 10000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 5) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 10000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 15000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 6) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 15000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 20000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 7) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 20000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 25000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 8) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 25000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 30000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 9) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 30000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 35000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 10) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 35000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 45000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 11) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 45000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 55000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 12) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 55000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 65000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 13) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 65000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 75000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 14) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 75000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 85000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 15) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 85000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 90000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 16) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 90000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 100000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 17) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 100000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 115000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 18) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 115000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 130000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 19) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 130000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (SkilsModVariables.MapVariables.get(world).custom_xp >= 150000) {
			if (SkilsModVariables.MapVariables.get(world).battle_lvl == 20) {
				SkilsModVariables.MapVariables.get(world).custom_xp = SkilsModVariables.MapVariables.get(world).custom_xp - 150000;
				SkilsModVariables.MapVariables.get(world).syncData(world);
				SkilsModVariables.MapVariables.get(world).battle_lvl = SkilsModVariables.MapVariables.get(world).battle_lvl + 1;
				SkilsModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}