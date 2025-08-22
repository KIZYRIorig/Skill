/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.skils.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.skils.client.gui.SkillsScreen;
import net.mcreator.skils.client.gui.ShotingScreen;
import net.mcreator.skils.client.gui.MiningScreen;
import net.mcreator.skils.client.gui.IntelektScreen;
import net.mcreator.skils.client.gui.FightScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SkilsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SkilsModMenus.SKILLS.get(), SkillsScreen::new);
			MenuScreens.register(SkilsModMenus.FIGHT.get(), FightScreen::new);
			MenuScreens.register(SkilsModMenus.INTELEKT.get(), IntelektScreen::new);
			MenuScreens.register(SkilsModMenus.MINING.get(), MiningScreen::new);
			MenuScreens.register(SkilsModMenus.SHOTING.get(), ShotingScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}