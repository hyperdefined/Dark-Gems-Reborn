package hyperdefined.darkgemsrb.tools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
public class DarkSword extends ItemSword {

	public DarkSword(int i, ToolMaterial gem) {
		super(gem);
		this.setUnlocalizedName("DarkSword");
		this.setTextureName("darkgemsrb:dark_sword");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.epic;
		
	}

}
