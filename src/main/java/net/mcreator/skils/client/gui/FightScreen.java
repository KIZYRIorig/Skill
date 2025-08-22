package net.mcreator.skils.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.skils.world.inventory.FightMenu;
import net.mcreator.skils.network.FightButtonMessage;
import net.mcreator.skils.init.SkilsModScreens;
import net.mcreator.skils.SkilsMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class FightScreen extends AbstractContainerScreen<FightMenu> implements SkilsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	ImageButton imagebutton_skill1111;

	public FightScreen(FightMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 360;
		this.imageHeight = 190;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("skils:textures/screens/fight.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		boolean customTooltipShown = false;
		if (mouseX > leftPos + 24 && mouseX < leftPos + 48 && mouseY > topPos + 97 && mouseY < topPos + 121) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.skils.fight.tooltip_s_shansom_10_poslie_ubiistva_daiot"), mouseX, mouseY);
			customTooltipShown = true;
		}
		if (!customTooltipShown)
			this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_skill1111 = new ImageButton(this.leftPos + 21, this.topPos + 69, 32, 32, 0, 0, 32, ResourceLocation.parse("skils:textures/screens/atlas/imagebutton_skill1111.png"), 32, 64, e -> {
			int x = FightScreen.this.x;
			int y = FightScreen.this.y;
			if (true) {
				SkilsMod.PACKET_HANDLER.sendToServer(new FightButtonMessage(0, x, y, z));
				FightButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		this.addRenderableWidget(imagebutton_skill1111);
	}
}