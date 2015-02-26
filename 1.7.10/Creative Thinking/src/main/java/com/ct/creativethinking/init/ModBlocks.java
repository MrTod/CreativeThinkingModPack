package com.ct.creativethinking.init;


import com.ct.creativethinking.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    //Name
    public static final BlockFireOpalOre FireOpalOre = new BlockFireOpalOre();
    public static final BlockBlueOpalOre BlueOpalOre = new BlockBlueOpalOre();
    public static final BlockPurpleOpalOre PurpleOpalOre = new BlockPurpleOpalOre();
    public static final BlockWolfamiteOre WolfamiteOre = new BlockWolfamiteOre();
    public static final BlockJadeOre JadeOre = new BlockJadeOre();
    public static final BlockAquamarineOre AquamarineOre = new BlockAquamarineOre();
    public static final BlockGarnetOre GarnetOre = new BlockGarnetOre();
    public static final BlockTourmalineOre TourmalineOre = new BlockTourmalineOre();
    public static final BlockCitrineOre CitrineOre = new BlockCitrineOre();
    public static final BlockTigerIronOre TigerIronOre = new BlockTigerIronOre();
    //public static final Block OpalFurnace;
    //public static final Block OpalFurnaceActive;





    //Mod Block
    public static final BlockCTLOGO BlockCTLOGO = new BlockCTLOGO();


    //Register
    public static void init()
    {
        //ORE
        GameRegistry.registerBlock(FireOpalOre, "FireOpalOre");
        GameRegistry.registerBlock(BlueOpalOre, "BlueOpalOre");
        GameRegistry.registerBlock(PurpleOpalOre, "PurpleOpalOre");
        GameRegistry.registerBlock(WolfamiteOre, "WolfamiteOre");
        GameRegistry.registerBlock(JadeOre, "JadeOre");
        GameRegistry.registerBlock(AquamarineOre, "AquamarineOre");
        GameRegistry.registerBlock(GarnetOre, "GarnetOre");
        GameRegistry.registerBlock(TourmalineOre, "TourmalineOre");
        GameRegistry.registerBlock(CitrineOre, "CirtineOre");
        GameRegistry.registerBlock(TigerIronOre, "TigerIronOre");
        GameRegistry.registerBlock(BlockCTLOGO, "BlockCTLOGO");


    }
}
