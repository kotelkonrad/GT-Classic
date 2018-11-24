package gtclassic.blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gtclassic.GTClassic;
import gtclassic.tileentity.GTTileEntityComputerCube;
import ic2.core.block.base.BlockMultiID;
import ic2.core.block.base.tile.TileEntityBlock;
import ic2.core.platform.textures.Ic2Icons;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GTBlockComputerCube extends BlockMultiID  {

	public GTBlockComputerCube() {
		super(Material.IRON);
		this.setHardness(4.0F);
        this.setResistance(20.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(GTClassic.creativeTabGT);
        this.setRegistryName("computer_cube");
        this.setUnlocalizedName(GTClassic.MODID + ".computerCube");
	}

	@Override
    public List<Integer> getValidMetas() {
        return Arrays.asList(0);
    }

	@Override
    public TileEntityBlock createNewTileEntity(World worldIn, int meta)
    {
    	return new GTTileEntityComputerCube();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public TextureAtlasSprite[] getIconSheet(int meta)
    {
        //needed for construction but get overwritten
    	return Ic2Icons.getTextures("gtclassic_blocks");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public TextureAtlasSprite getTextureFromState(IBlockState state, EnumFacing side) 
    {
            return Ic2Icons.getTextures("gtclassic_blocks")[8];
    }

	@SideOnly(Side.CLIENT)
	public TextureAtlasSprite getParticleTexture(IBlockState state) {
		return Ic2Icons.getTextures("gtclassic_blocks")[8];
	}

    @Override
    public List<IBlockState> getValidStateList()
    {
        IBlockState def = getDefaultState();
        List<IBlockState> states = new ArrayList<IBlockState>();
        for(EnumFacing side : EnumFacing.VALUES)
        {
            states.add(def.withProperty(getMetadataProperty(), 0).withProperty(allFacings, side).withProperty(active, false));
        }
        return states;
    }

    @Override
    public List<IBlockState> getValidStates()
    {
        return getBlockState().getValidStates();
    }

}
