package net.mcreator.skils.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.skils.world.inventory.SkillsMenu;
import net.mcreator.skils.procedures.ShowxpProcedure;
import net.mcreator.skils.procedures.ShowskillpointProcedure;
import net.mcreator.skils.procedures.BattlelvlshowProcedure;
import net.mcreator.skils.network.SkillsButtonMessage;
import net.mcreator.skils.init.SkilsModScreens;
import net.mcreator.skils.SkilsMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class SkillsScreen extends AbstractContainerScreen<SkillsMenu> implements SkilsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_boi;
	Button button_pokupka_skill_pointa;
	ImageButton imagebutton_pixilframe0;

	public SkillsScreen(SkillsMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("skils:textures/screens/skills.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("skils:textures/screens/stand_gui.png"), this.leftPos + 1, this.topPos + -1, 0, 0, 360, 190, 360, 190);
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
		guiGraphics.drawString(this.font, ShowxpProcedure.execute(world), 6, 173, -12829636, false);
		guiGraphics.drawString(this.font, BattlelvlshowProcedure.execute(world), 238, 44, -12829636, false);
		guiGraphics.drawString(this.font, ShowskillpointProcedure.execute(world), 273, 168, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_boi = Button.builder(Component.translatable("gui.skils.skills.button_boi"), e -> {
			int x = SkillsScreen.this.x;
			int y = SkillsScreen.this.y;
			if (true) {
				SkilsMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(0, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 20, this.topPos + 13, 40, 20).build();
		this.addRenderableWidget(button_boi);
		button_pokupka_skill_pointa = Button.builder(Component.translatable("gui.skils.skills.button_pokupka_skill_pointa"), e -> {
			int x = SkillsScreen.this.x;
			int y = SkillsScreen.this.y;
			if (true) {
				SkilsMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(1, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 224, this.topPos + 143, 129, 20).build();
		this.addRenderableWidget(button_pokupka_skill_pointa);
		imagebutton_pixilframe0 = new ImageButton(this.leftPos + 223, this.topPos + 9, 100, 50, 0, 0, 50, ResourceLocation.parse("skils:textures/screens/atlas/imagebutton_pixilframe0.png"), 100, 100, e -> {
			int x = SkillsScreen.this.x;
			int y = SkillsScreen.this.y;
			if (true) {
				SkilsMod.PACKET_HANDLER.sendToServer(new SkillsButtonMessage(2, x, y, z));
				SkillsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		this.addRenderableWidget(imagebutton_pixilframe0);
	}
}