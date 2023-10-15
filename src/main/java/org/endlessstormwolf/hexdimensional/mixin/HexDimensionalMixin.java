package org.endlessstormwolf.hexdimensional.mixin;

import org.endlessstormwolf.hexdimensional.HexDimensional;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class HexDimensionalMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void exampleMod$onInit(CallbackInfo ci) {
		HexDimensional.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
