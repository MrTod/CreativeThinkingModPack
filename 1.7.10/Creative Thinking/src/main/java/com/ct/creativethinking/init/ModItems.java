package com.ct.creativethinking.init;

import com.ct.creativethinking.creativetabs.CreativeTabCT;
import com.ct.creativethinking.item.*;
import com.ct.creativethinking.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Material
    //Todo Fix Mat
    //public static Item.ToolMaterial WolfamiteMat = EnumHelper.addToolMaterial("WolfamiteMat", 2, 1561, 7.0F, 5.0F, 14);





    public static final ItemCT CTLOGO = new ItemCTLOGO();
    public static final ItemCT FireOpalIngot = new ItemFireOpalIngot();
    public static final ItemCT BlueOpalIngot = new ItemBlueOpalIngot();
    public static final ItemCT PurpleOpalIngot = new ItemPurpleOpalIngot();
    public static final ItemCT WolfamiteIngot = new ItemWolfamiteIngot();
    public static final ItemCT JadeIngot = new ItemJadeIngot();
    public static final ItemCT AquamarineIngot = new ItemAquamarineIngot();
    public static final ItemCT GarnetIngot = new ItemGarnetIngot();
    public static final ItemCT TourmalineIngot = new ItemTourmalineIngot();
    public static final ItemCT CitrineIngot = new ItemCitrineIngot();
    public static final ItemCT TigerIronIngot = new ItemTigerIronIngot();
    public static final ItemCT Briquette = new ItemBriquette();


    //Scath
    public static final ItemCT RawScathMeat = new ItemRawScathMeat();
    public static final ItemCT CookedScathMeat = new ItemCookedScathMeat();
    public static final ItemCT ScathPowder = new ItemScathPowder();


    //Trees
    //blockLog = new CTLog().setBlock





    //Tools
    //public static Item WolfamiteSword;

          public static void init()
      {

          GameRegistry.registerItem(CTLOGO, "CTLOGO");
          GameRegistry.registerItem(FireOpalIngot, "FireOpalIngot");
          GameRegistry.registerItem(BlueOpalIngot, "BlueOpalIngot");
          GameRegistry.registerItem(PurpleOpalIngot, "PurpleOpalIngot");
          GameRegistry.registerItem(WolfamiteIngot, "WolfamiteIngot");
          GameRegistry.registerItem(JadeIngot, "JadeIngot");
          GameRegistry.registerItem(AquamarineIngot, "AquamarineIngot");
          GameRegistry.registerItem(GarnetIngot, "GarnetIngot");
          GameRegistry.registerItem(TourmalineIngot, "TourmalineIngot");
          GameRegistry.registerItem(CitrineIngot, "CitrineIngot");
          GameRegistry.registerItem(TigerIronIngot, "TigerIronIngot");
          GameRegistry.registerItem(Briquette, "Briquette");

          //Scath
          GameRegistry.registerItem(RawScathMeat, "RawScathMeat");
          GameRegistry.registerItem(CookedScathMeat, "CookedScathMeat");
          GameRegistry.registerItem(ScathPowder, "ScathPowder");



//Tools
          //TODO for tools fix
          // //GameRegistry.registerItem(WolfamiteSword = new ItemWolfamiteSword(WolfamiteMat)
          //GameRegistry.registerItem(WolfamiteSword, "WolfamiteSword");
          //GameRegistry.registerItem(WolfamiteSword, "WolfamiteSword");



      }
    }