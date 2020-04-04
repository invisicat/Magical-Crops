package dev.andyiscool5463.magicalcrops.blocks.furnace;

import dev.andyiscool5463.magicalcrops.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiDualFurnace extends GuiContainer{
	
	private static final ResourceLocation DUAL_FURNACE_TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/container/accio_furnace_gui.png");
	private final InventoryPlayer player;
	private final TileEntityFurnace tileentity;
	
	public GuiDualFurnace(InventoryPlayer player, TileEntityFurnace tileentity) {
		super(new ContainerDualFurnace(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(DUAL_FURNACE_TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		if(TileEntityFurnace.isBurning(this.tileentity)) {
			int k = this.getBurnLeftScaled(13);
			this.drawTexturedModalRect(this.guiLeft + 56, this.guiTop + 37 + 12 - k, 176, 12 - k, 14, k + 1);
		}
		
		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 79, this.guiTop + 34, 176, 14, l + 1, 16);
		int r = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 109, this.guiTop + 18, 176, 31, 23 - r, 16);
	}
	
	private int getBurnLeftScaled(int pixels) {
		int i = this.tileentity.getField(1);
		
		if(i == 0)
			i = 200;
		return this.tileentity.getField(0) * pixels / i;
	}
	
	private int getCookProgressScaled(int pixels) {
		int i = this.tileentity.getField(2);
        int j = this.tileentity.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
	}
}