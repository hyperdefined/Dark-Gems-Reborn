package hyperdefined.darkgemsrb.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class DarkAxe extends ItemAxe{

	public DarkAxe(int i,ToolMaterial gem) {
		super(gem);
		this.setUnlocalizedName("DarkAxe");
		this.setTextureName("darkgemsrb:dark_axe");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.epic;
		
	}

}
