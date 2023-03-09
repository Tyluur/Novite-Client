/* Class38 - Decompiled by JODE
 * 
 */

public class TemporaryItemDefinition
{
	protected int[] maleWornModelIds;
	static long aLong562 = -1L;
	protected short[] modifiedTextureColors;
	protected int[] anIntArray564;
	static d aD565;
	protected int[] femaleWornModelIds;
	protected short[] modifiedModelColors;
	protected int[] anIntArray568 = new int[2];
	static int anInt569;
	
	public static void method402(int i) {
		aD565 = null;
		if (i != 0) {
			aLong562 = 8L;
		}
	}
	
	static final void method403(int i) {
		anInt569++;
		if (Node_Sub38_Sub8.anInt10163 != i) {
			Class320_Sub23.aClass123_8432.method1513(i ^ ~0x6e0f);
			Class375.method4115((byte) -97);
			Class297.method3479((byte) -119);
		}
	}
	
	TemporaryItemDefinition(ItemDefinitions itemdefinition) {
		anIntArray564 = new int[2];
		maleWornModelIds = new int[3];
		femaleWornModelIds = new int[3];
		maleWornModelIds[0] = itemdefinition.maleEquip1;
		maleWornModelIds[1] = itemdefinition.maleEquip2;
		maleWornModelIds[2] = itemdefinition.maleEquipModelId3;
		femaleWornModelIds[0] = itemdefinition.femaleEquip1;
		femaleWornModelIds[1] = itemdefinition.femaleEquip2;
		femaleWornModelIds[2] = itemdefinition.femaleEquipModelId3;
		anIntArray564[0] = itemdefinition.maleDialogueModel;
		anIntArray564[1] = itemdefinition.maleDialogueHat;
		anIntArray568[0] = itemdefinition.femaleDialogueModel;
		anIntArray568[1] = itemdefinition.femaleDialogueHat;
		if (itemdefinition.modifiedModelColors != null) {
			modifiedModelColors = new short[itemdefinition.modifiedModelColors.length];
			Class311.method3606(itemdefinition.modifiedModelColors, 0, modifiedModelColors, 0, modifiedModelColors.length);
		}
		if (itemdefinition.modifiedTextureColors != null) {
			modifiedTextureColors = new short[itemdefinition.modifiedTextureColors.length];
			Class311.method3606(itemdefinition.modifiedTextureColors, 0, modifiedTextureColors, 0, modifiedTextureColors.length);
		}
	}
}
