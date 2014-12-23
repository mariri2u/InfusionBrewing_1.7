package mariri.infusionbrewing.recipe;

import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.AspectList;

public class InfusionBrewingRecipeSplash extends InfusionBrewingRecipe  {
	public InfusionBrewingRecipeSplash(String research, Object output, int inst, AspectList aspects2, ItemStack input, ItemStack[] recipe){
		super(research, output, inst, aspects2, input, recipe);
	}
	
	@Override
	public MODE getMode(){
		return MODE.SPLASH;
	}

}
