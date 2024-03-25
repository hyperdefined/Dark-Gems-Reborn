package hyperdefined.darkgemsrb.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class DarkSpade extends ItemSpade{

	public DarkSpade(int i,ToolMaterial gem) {
		super(gem);
		this.setUnlocalizedName("DarkSpade");
		this.setTextureName("darkgemsrb:dark_shovel");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.epic;
		
	}

}
