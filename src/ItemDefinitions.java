/* ItemDefinition - Decompiled by JODE
 * 
 */

public class ItemDefinitions {

	public static final byte SLOT_HAT = 0, SLOT_CAPE = 1, SLOT_AMULET = 2, SLOT_WEAPON = 3, SLOT_CHEST = 4, SLOT_SHIELD = 5, SLOT_LEGS = 7, SLOT_HANDS = 9, SLOT_FEET = 10, SLOT_RING = 12, SLOT_ARROWS = 13, SLOT_AURA = 14;

	static int anInt1848;
	protected int anInt1849;
	private short[] originalTextureColors;
	protected int anInt1851 = -1;
	protected int lendTemplateId;
	protected int maleEquip1;
	static int anInt1854;
	static int anInt1855;
	private short[] originalModelColors;
	protected int certTemplateId;
	static int anInt1858;
	protected int unknownInt23;
	protected String name;
	static int anInt1861;
	protected int unknownInt25;
	protected int femaleDialogueModel;
	protected int unknownInt24;
	protected short[] modifiedModelColors;
	protected int rotationZoom;
	protected int maleEquipModelId3;
	protected Class86 aClass86_1868;
	protected int modelRotation2;
	static int anInt1870;
	protected boolean membersOnly;
	protected int[] stackAmounts;
	protected HashTable clientScriptData;
	protected int modelZoom;
	protected int modelOffset2;
	private int modelLighting;
	protected int dummyItem;
	protected int maleEquip2;
	protected int unknownInt11;
	protected int femaleEquip1;
	static int anInt1881;
	private byte[] recolourPallete;
	protected int femaleEquip2;
	protected int modelRotation1;
	static int anInt1885;
	private int modelShadowing;
	protected int certId;
	protected int maleDialogueHat;
	protected int unknownInt19;
	private int unknownInt15;
	protected int unknownValue2;
	protected int stackable;
	private int unknownInt16;
	static int anInt1894;
	private int unknownInt14;
	private int modelVerticesZ;
	protected int femaleDialogueHat;
	private int modelId;
	protected int teamId;
	protected int unknownInt22;
	protected String[] inventoryOptions;
	static int anInt1902;
	static int anInt1903;
	private int modelVerticesX;
	protected int modelOffset1;
	static int anInt1906;
	static int anInt1907;
	protected int unknownInt18;
	protected int unknownInt20;
	protected int unknownInt21;
	protected short[] modifiedTextureColors;
	static int anInt1910;
	private int modelVerticesY;
	static int anInt1912;
	protected int maleDialogueModel;
	protected int anInt1914;
	protected int femaleEquipModelId3;
	private int unknownInt17;
	static int anInt1917;
	protected int[] stackIds;
	protected int unknownValue3;
	protected String[] groundOptions;
	static int anInt1921;
	static int anInt1922;
	static int anInt1923;
	protected int value;
	static Node_Sub43 aNode_Sub43_1925;
	protected int[] unknownArray2;
	protected int lendId;
	protected int unknownValue1;
	static int anInt1929;
	private int unknownInt13;
	private int unknownInt12;
	static int anInt1932;
	protected boolean showInGrandExchange;
	protected int equipSlot;
	protected int equipType;
	protected boolean isTradeable;
	protected boolean isExchangeable;

	public static int id;

	static final void method1673(int i, int i_0_) {
		anInt1855++;
		if ((Class151.anInt1843 ^ 0xffffffff) == -8 && ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -1 && Class4.anInt124 == 0)) {
			Node_Sub38_Sub23.anInt10347 = i;
			if (i_0_ != 2) {
				method1690((byte) 19);
			}
			Class48.method478(9, (byte) 113);
		}
	}

	final ItemDefinitions method1674(int i, int i_1_) {
		if (i_1_ >= -68) {
			return null;
		}
		anInt1902++;
		if (stackIds != null && (i ^ 0xffffffff) < -2) {
			int i_2_ = -1;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -11; i_3_++) {
				if ((stackAmounts[i_3_] ^ 0xffffffff) >= (i ^ 0xffffffff) && (stackAmounts[i_3_] ^ 0xffffffff) != -1) {
					i_2_ = stackIds[i_3_];
				}
			}
			if (i_2_ != -1) {
				return aClass86_1868.getItemDefinitionForId(i_2_);
			}
		}
		return this;
	}

	final void decode(Buffer buffer) {
		anInt1861++;
		for (;;) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				ItemDefinitions.id = -1;
				break;
			}
			parseItemDefs(buffer, opcode);
		}
	}

	final void toLend(byte b, ItemDefinitions realItem, ItemDefinitions itemdefinition_6_) {
		modifiedModelColors = realItem.modifiedModelColors;
		maleDialogueModel = realItem.maleDialogueModel;
		maleDialogueHat = realItem.maleDialogueHat;
		maleEquipModelId3 = realItem.maleEquipModelId3;
		teamId = realItem.teamId;
		clientScriptData = realItem.clientScriptData;
		membersOnly = realItem.membersOnly;
		modifiedTextureColors = realItem.modifiedTextureColors;
		unknownInt13 = realItem.unknownInt13;
		femaleEquip2 = realItem.femaleEquip2;
		rotationZoom = itemdefinition_6_.rotationZoom;
		groundOptions = realItem.groundOptions;
		anInt1923++;
		femaleDialogueHat = realItem.femaleDialogueHat;
		recolourPallete = realItem.recolourPallete;
		if (b < 74) {
			method1673(-71, 35);
		}
		unknownInt16 = realItem.unknownInt16;
		modelRotation1 = itemdefinition_6_.modelRotation1;
		femaleEquip1 = realItem.femaleEquip1;
		modelId = itemdefinition_6_.modelId;
		inventoryOptions = new String[5];
		modelRotation2 = itemdefinition_6_.modelRotation2;
		modelOffset2 = itemdefinition_6_.modelOffset2;
		originalTextureColors = realItem.originalTextureColors;
		unknownInt15 = realItem.unknownInt15;
		maleEquip2 = realItem.maleEquip2;
		value = 0;
		unknownInt14 = realItem.unknownInt14;
		originalModelColors = realItem.originalModelColors;
		modelOffset1 = itemdefinition_6_.modelOffset1;
		unknownInt17 = realItem.unknownInt17;
		femaleDialogueModel = realItem.femaleDialogueModel;
		modelZoom = itemdefinition_6_.modelZoom;
		name = realItem.name;
		femaleEquipModelId3 = realItem.femaleEquipModelId3;
		maleEquip1 = realItem.maleEquip1;
		unknownInt12 = realItem.unknownInt12;
		equipSlot = realItem.equipSlot;
		equipType = realItem.equipType;
		if (realItem.inventoryOptions != null) {
			for (int i = 0; (i ^ 0xffffffff) > -5; i++)
				inventoryOptions[i] = realItem.inventoryOptions[i];
		}
		inventoryOptions[4] = Class22.aClass22_369.method297(aClass86_1868.anInt1161);
	}

	final void toNote(ItemDefinitions itemdefinition_7_, int i, ItemDefinitions itemdefinition_8_) {
		modelOffset2 = itemdefinition_7_.modelOffset2;
		originalModelColors = itemdefinition_7_.originalModelColors;
		value = itemdefinition_8_.value;
		name = itemdefinition_8_.name;
		modifiedTextureColors = itemdefinition_7_.modifiedTextureColors;
		modelRotation2 = itemdefinition_7_.modelRotation2;
		rotationZoom = itemdefinition_7_.rotationZoom;
		originalTextureColors = itemdefinition_7_.originalTextureColors;
		modelId = itemdefinition_7_.modelId;
		modelZoom = itemdefinition_7_.modelZoom;
		recolourPallete = itemdefinition_7_.recolourPallete;
		stackable = 1;
		modelRotation1 = itemdefinition_7_.modelRotation1;
		modelOffset1 = itemdefinition_7_.modelOffset1;
		membersOnly = itemdefinition_8_.membersOnly;
		modifiedModelColors = itemdefinition_7_.modifiedModelColors;
		anInt1894++;
	}

	final int method1678(int i, int i_10_, int i_11_) {
		anInt1870++;
		if (clientScriptData == null) {
			return i_10_;
		}
		Node_Sub32 node_sub32 = (Node_Sub32) clientScriptData.method1518(i_11_ ^ 0x25bf, (long) i);
		if (i_11_ != 10247) {
			unknownInt22 = 69;
		}
		if (node_sub32 == null) {
			return i_10_;
		}
		return node_sub32.anInt7381;
	}

	private final int[] method1679(int i, int i_12_, int[] is) {
		anInt1912++;
		int[] is_13_ = new int[1152];
		int i_14_ = 0;
		for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -33; i_15_++) {
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -37; i_16_++) {
				int i_17_ = is[i_14_];
				if (i_17_ == 0) {
					if ((i_16_ ^ 0xffffffff) >= -1 || (is[-1 + i_14_] ^ 0xffffffff) == -1) {
						if (i_15_ > 0 && (is[i_14_ - 36] ^ 0xffffffff) != -1) {
							i_17_ = i_12_;
						} else if ((i_16_ ^ 0xffffffff) > -36 && (is[i_14_ - -1] ^ 0xffffffff) != -1) {
							i_17_ = i_12_;
						} else if ((i_15_ ^ 0xffffffff) > -32 && is[36 + i_14_] != 0) {
							i_17_ = i_12_;
						}
					} else {
						i_17_ = i_12_;
					}
				}
				is_13_[i_14_++] = i_17_;
			}
		}
		if (i != -1) {
			originalModelColors = null;
		}
		return is_13_;
	}

	public static void method1680(byte b) {
		if (b <= 84) {
			anInt1858 = -85;
		}
		aNode_Sub43_1925 = null;
	}

	public boolean canExchange(int itemId) {
		return isExchangeable;
	}

	public boolean isTradeable() {
		return isTradeable;
	}

	public boolean isWearItem() {
		return equipSlot != -1;
	}

	public boolean isWearItem(boolean male) {
		if (equipSlot < SLOT_RING && (male ? maleEquip1 == -1 : femaleEquip1 == -1)) {
			return false;
		}
		return equipSlot != -1;
	}

	private final void parseItemDefs(Buffer stream, int opcode) {
		if (opcode == 1) {
			modelId = stream.readUnsignedShort();
		} else if (opcode == 2) {
			name = stream.readString();
		} else if (opcode == 4) {
			modelZoom = stream.readUnsignedShort();
		} else if (opcode == 5) {
			modelRotation1 = stream.readUnsignedShort();
		} else if (opcode == 6) {
			modelRotation2 = stream.readUnsignedShort();
		} else if (opcode == 7) {
			modelOffset1 = stream.readUnsignedShort();
			if (modelOffset1 > 32767) {
				modelOffset1 -= 65536;
			}
		} else if (opcode == 8) {
			modelOffset2 = stream.readUnsignedShort();
			if (modelOffset2 > 32767) {
				modelOffset2 -= 65536;
			}
		} else if (opcode == 11) {
			stackable = 1;
		} else if (opcode == 12) {
			value = stream.readInt();
		} else if (opcode == 13) {
			equipSlot = stream.readUnsignedByte();
		} else if (opcode == 14) {
			equipType = stream.readUnsignedByte();
		} else if (opcode == 15) {
			isTradeable = stream.readUnsignedByte() == 1;
		} else if (opcode == 17) {
			isExchangeable = stream.readUnsignedByte() == 1;
		} else if (opcode == 16) {
			membersOnly = true;
		} else if (opcode == 18) {
			unknownInt11 = stream.readUnsignedShort();
		} else if (opcode == 23) {
			maleEquip1 = stream.readUnsignedShort();
		} else if (opcode == 24) {
			maleEquip2 = stream.readUnsignedShort();
		} else if (opcode == 25) {
			femaleEquip1 = stream.readUnsignedShort();
		} else if (opcode == 26) {
			femaleEquip2 = stream.readUnsignedShort();
		} else if (opcode >= 30 && opcode < 35) {
			groundOptions[opcode - 30] = stream.readString();
		} else if (opcode >= 35 && opcode < 40) {
			inventoryOptions[opcode - 35] = stream.readString();
		} else if (opcode == 40) {
			int length = stream.readUnsignedByte();
			originalModelColors = new short[length];
			modifiedModelColors = new short[length];
			for (int index = 0; length > index; index++) {
				originalModelColors[index] = (short) stream.readUnsignedShort();
				modifiedModelColors[index] = (short) stream.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int length = stream.readUnsignedByte();
			originalTextureColors = new short[length];
			modifiedTextureColors = new short[length];
			for (int index = 0; index < length; index++) {
				originalTextureColors[index] = (short) stream.readUnsignedShort();
				modifiedTextureColors[index] = (short) stream.readUnsignedShort();
			}
		} else if (opcode == 42) {
			int length = stream.readUnsignedByte();
			recolourPallete = new byte[length];
			for (int index = 0; index < length; index++) {
				recolourPallete[index] = (byte) stream.readByte();
			}
		} else if (opcode == 65) {
			showInGrandExchange = true;
		} else if (opcode == 78) {
			maleEquipModelId3 = stream.readUnsignedShort();
		} else if (opcode == 79) {
			femaleEquipModelId3 = stream.readUnsignedShort();
		} else if (opcode == 90) {
			maleDialogueModel = stream.readUnsignedShort();
		} else if (opcode == 91) {
			femaleDialogueModel = stream.readUnsignedShort();
		} else if (opcode == 92) {
			maleDialogueHat = stream.readUnsignedShort();
		} else if (opcode == 93) {
			femaleDialogueHat = stream.readUnsignedShort();
		} else if (opcode == 95) {
			rotationZoom = stream.readUnsignedShort();
		} else if (opcode == 96) {
			dummyItem = stream.readUnsignedByte();
		} else if (opcode == 97) {
			certId = stream.readUnsignedShort();
		} else if (opcode == 98) {
			certTemplateId = stream.readUnsignedShort();
		} else if (opcode >= 100 && opcode < 110) {
			if (stackIds == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackIds[opcode - 100] = stream.readUnsignedShort();
			stackAmounts[opcode - 100] = stream.readUnsignedShort();
		} else if (opcode == 110) {
			modelVerticesX = stream.readUnsignedShort();
		} else if (opcode == 111) {
			modelVerticesY = stream.readUnsignedShort();
		} else if (opcode == 112) {
			modelVerticesZ = stream.readUnsignedShort();
		} else if (opcode == 113) {
			modelLighting = stream.readByte();
		} else if (opcode == 114) {
			modelShadowing = stream.readByte() * 5;
		} else if (opcode == 115) {
			teamId = stream.readUnsignedByte();
		} else if (opcode == 121) {
			lendId = stream.readUnsignedShort();
		} else if (opcode == 122) {
			lendTemplateId = stream.readUnsignedShort();
		} else if (opcode == 125) {
			unknownInt12 = stream.readByte() << 2;
			unknownInt13 = stream.readByte() << 2;
			unknownInt14 = stream.readByte() << 2;
		} else if (opcode == 126) {
			unknownInt15 = stream.readByte() << 2;
			unknownInt16 = stream.readByte() << 2;
			unknownInt17 = stream.readByte() << 2;
		} else if (opcode == 127) {
			unknownInt18 = stream.readUnsignedByte();
			unknownInt19 = stream.readUnsignedShort();
		} else if (opcode == 128) {
			unknownInt20 = stream.readUnsignedByte();
			unknownInt21 = stream.readUnsignedShort();
		} else if (opcode == 129) {
			unknownInt22 = stream.readUnsignedByte();
			unknownInt23 = stream.readUnsignedShort();
		} else if (opcode == 130) {
			unknownInt24 = stream.readUnsignedByte();
			unknownInt25 = stream.readUnsignedShort();
		} else if (opcode == 132) {
			int length = stream.readUnsignedByte();
			unknownArray2 = new int[length];
			for (int index = 0; index < length; index++) {
				unknownArray2[index] = stream.readUnsignedShort();
			}
		} else if (opcode == 134) {
			unknownValue3 = stream.readUnsignedByte();
		} else if (opcode == 139) {
			unknownValue2 = stream.readUnsignedShort();
		} else if (opcode == 140) {
			unknownValue1 = stream.readUnsignedShort();
		} else if (opcode == 249) {
			int length = stream.readUnsignedByte();
			if (clientScriptData == null) {
				int size = Class320_Sub19.method3753(length);
				clientScriptData = new HashTable(size);
			}
			for (int index = 0; length > index; index++) {
				boolean isString = stream.readUnsignedByte() == 1;
				int key = stream.read24BitInteger();
				Node node;
				if (!isString) {
					node = new Node_Sub32(stream.readInt());
				} else {
					node = new Node_Sub18(stream.readString());
				}
				clientScriptData.put((long) key, node, -127);
			}
		} else {
			throw new RuntimeException("MISSING OPCODE " + opcode + " FOR ITEM " + name);
		}
		anInt1922++;
	}

	final int[] drawInventoryModel(int i, GraphicsToolkit graphicstoolkit, int i_31_, byte b, int i_32_, boolean bool, PlayerDefinition playerdefinition, GraphicsToolkit graphicstoolkit_33_, Class52 class52, int i_34_) {
		anInt1854++;
		Model model = Renderer.method3448(modelId, 7, 0, aClass86_1868.aClass302_1168);
		if (model == null) {
			return null;
		}
		if ((model.anInt2614 ^ 0xffffffff) > -14) {
			model.method2081(2, 0);
		}
		if (originalModelColors != null) {
			for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (originalModelColors.length ^ 0xffffffff); i_35_++) {
				if (recolourPallete == null || (i_35_ ^ 0xffffffff) <= (recolourPallete.length ^ 0xffffffff)) {
					model.method2089(originalModelColors[i_35_], modifiedModelColors[i_35_], -126);
				} else {
					model.method2089(originalModelColors[i_35_], Class129.aShortArray1665[0xff & recolourPallete[i_35_]], -89);
				}
			}
		}
		if (originalTextureColors != null) {
			for (int i_36_ = 0; (originalTextureColors.length ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++)
				model.method2087(originalTextureColors[i_36_], modifiedTextureColors[i_36_], -78);
		}
		if (playerdefinition != null) {
			for (int i_37_ = 0; i_37_ < 10; i_37_++) {
				for (int i_38_ = 0; (Class45.aShortArrayArray5265[i_37_].length ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
					if ((playerdefinition.anIntArray3430[i_37_] ^ 0xffffffff) > (Class117_Sub2.aShortArrayArrayArray5151[i_37_][i_38_].length ^ 0xffffffff)) {
						model.method2089(Class45.aShortArrayArray5265[i_37_][i_38_], Class117_Sub2.aShortArrayArrayArray5151[i_37_][i_38_][playerdefinition.anIntArray3430[i_37_]], -60);
					}
				}
			}
		}
		int i_39_ = 2048;
		boolean bool_40_ = false;
		if ((modelVerticesX ^ 0xffffffff) != -129 || (modelVerticesY ^ 0xffffffff) != -129 || modelVerticesZ != 128) {
			bool_40_ = true;
			i_39_ |= 0x7;
		}
		DrawableModel drawablemodel = graphicstoolkit_33_.a(model, i_39_, 64, modelLighting + 64, modelShadowing + 768);
		if (!drawablemodel.method612()) {
			return null;
		}
		if (bool_40_) {
			drawablemodel.O(modelVerticesX, modelVerticesY, modelVerticesZ);
		}
		GLSprite glsprite = null;
		if (certTemplateId != -1) {
			glsprite = aClass86_1868.method1002(1, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, 0, 10, true, 0, class52, certId, -16139);
			if (glsprite == null) {
				return null;
			}
		} else if ((lendTemplateId ^ 0xffffffff) != 0) {
			glsprite = aClass86_1868.method1002(i_34_, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, i_32_, i_31_, false, 0, class52, lendId, -16139);
			if (glsprite == null) {
				return null;
			}
		} else if ((unknownValue1 ^ 0xffffffff) != 0) {
			glsprite = aClass86_1868.method1002(i_34_, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, i_32_, i_31_, false, 0, class52, unknownValue2, -16139);
			if (glsprite == null) {
				return null;
			}
		}
		int i_42_;
		if (bool) {
			i_42_ = (int) (1.5 * (double) modelZoom) << 2;
		} else if (i_34_ != 2) {
			i_42_ = modelZoom << 2;
		} else {
			i_42_ = (int) ((double) modelZoom * 1.04) << 2;
		}
		graphicstoolkit_33_.DA(16, 16, 512, 512);
		Class336 class336 = graphicstoolkit_33_.y();
		class336.method3862();
		graphicstoolkit_33_.a(class336);
		graphicstoolkit_33_.xa(1.0F);
		graphicstoolkit_33_.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		Class336 class336_43_ = graphicstoolkit_33_.A();
		class336_43_.method3861(-rotationZoom << 3);
		class336_43_.method3856(modelRotation2 << 3);
		class336_43_.method3863(modelOffset1 << 2, (Class335.anIntArray4167[modelRotation1 << 3] * i_42_ >> 14) + -(drawablemodel.fa() / 2) - -(modelOffset2 << 2), (Class335.anIntArray4165[modelRotation1 << 3] * i_42_ >> 14) - -(modelOffset2 << 2));
		class336_43_.method3859(modelRotation1 << 3);
		int i_44_ = graphicstoolkit_33_.i();
		int i_45_ = graphicstoolkit_33_.XA();
		graphicstoolkit_33_.f(50, 2147483647);
		graphicstoolkit_33_.ya();
		graphicstoolkit_33_.la();
		graphicstoolkit_33_.aa(0, 0, 36, 32, 0, 0);
		drawablemodel.method611(class336_43_, null, 1);
		graphicstoolkit_33_.f(i_44_, i_45_);
		int[] is = graphicstoolkit_33_.na(0, 0, 36, 32);
		if ((i_34_ ^ 0xffffffff) <= -2) {
			is = method1679(-1, -16777214, is);
			if (i_34_ >= 2) {
				is = method1679(-1, -1, is);
			}
		}
		if ((i_32_ ^ 0xffffffff) != -1) {
			method1688(i_32_, is, -7048);
		}
		graphicstoolkit_33_.method1235(36, 36, 32, is, 0, 7468).method1196(0, 0);
		if ((certTemplateId ^ 0xffffffff) == 0) {
			if (lendTemplateId != -1) {
				glsprite.method1196(0, 0);
			} else if ((unknownValue1 ^ 0xffffffff) != 0) {
				glsprite.method1196(0, 0);
			}
		} else {
			glsprite.method1196(0, 0);
		}
		if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -3 && ((stackable ^ 0xffffffff) == -2 || (i_31_ ^ 0xffffffff) != -2) && i_31_ != -1) {
			class52.method538(0, 9, method1687(22050, i_31_), -16777215, 1, -256);
		}
		is = graphicstoolkit_33_.na(0, 0, 36, 32);
		for (int i_46_ = 0; (is.length ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
			if ((0xffffff & is[i_46_] ^ 0xffffffff) == -1) {
				is[i_46_] = 0;
			} else {
				is[i_46_] = Node_Sub16.method2590(is[i_46_], -16777216);
			}
		}
		return is;
	}

	final Model method1683(TemporaryItemDefinition class38, boolean bool, int i) {
		anInt1917++;
		int i_47_;
		int i_48_;
		int i_49_;
		if (!bool) {
			if (class38 != null && class38.maleWornModelIds != null) {
				i_47_ = class38.maleWornModelIds[0];
				i_48_ = class38.maleWornModelIds[1];
				i_49_ = class38.maleWornModelIds[2];
			} else {
				i_49_ = maleEquipModelId3;
				i_47_ = maleEquip1;
				i_48_ = maleEquip2;
			}
		} else if (class38 == null || class38.femaleWornModelIds == null) {
			i_47_ = femaleEquip1;
			i_48_ = femaleEquip2;
			i_49_ = femaleEquipModelId3;
		} else {
			i_49_ = class38.femaleWornModelIds[2];
			i_47_ = class38.femaleWornModelIds[0];
			i_48_ = class38.femaleWornModelIds[1];
		}
		if (i_47_ == -1) {
			return null;
		}
		Model model = Renderer.method3448(i_47_, 7, 0, aClass86_1868.aClass302_1168);
		if (model == null) {
			return null;
		}
		if (model.anInt2614 < 13) {
			model.method2081(2, 0);
		}
		if ((i_48_ ^ 0xffffffff) != 0) {
			Model model_50_ = Renderer.method3448(i_48_, 7, 0, aClass86_1868.aClass302_1168);
			if ((model_50_.anInt2614 ^ 0xffffffff) > -14) {
				model_50_.method2081(2, 0);
			}
			if ((i_49_ ^ 0xffffffff) != 0) {
				Model model_51_ = Renderer.method3448(i_49_, 7, 0, aClass86_1868.aClass302_1168);
				if (model_51_.anInt2614 < 13) {
					model_51_.method2081(2, 0);
				}
				Model[] models = { model, model_50_, model_51_ };
				model = new Model(models, 3);
			} else {
				Model[] models = { model, model_50_ };
				model = new Model(models, 2);
			}
		}
		if (!bool && (unknownInt12 != 0 || (unknownInt13 ^ 0xffffffff) != -1 || (unknownInt14 ^ 0xffffffff) != -1)) {
			model.method2082(unknownInt12, unknownInt13, -102, unknownInt14);
		}
		if (bool && ((unknownInt15 ^ 0xffffffff) != -1 || (unknownInt16 ^ 0xffffffff) != -1 || unknownInt17 != 0)) {
			model.method2082(unknownInt15, unknownInt16, 96, unknownInt17);
		}
		if (originalModelColors != null) {
			short[] ses;
			if (class38 != null && class38.modifiedModelColors != null) {
				ses = class38.modifiedModelColors;
			} else {
				ses = modifiedModelColors;
			}
			for (int i_52_ = 0; i_52_ < originalModelColors.length; i_52_++)
				model.method2089(originalModelColors[i_52_], ses[i_52_], 76);
		}
		if (originalTextureColors != null) {
			short[] ses;
			if (class38 != null && class38.modifiedTextureColors != null) {
				ses = class38.modifiedTextureColors;
			} else {
				ses = modifiedTextureColors;
			}
			for (int i_53_ = 0; i_53_ < originalTextureColors.length; i_53_++)
				model.method2087(originalTextureColors[i_53_], ses[i_53_], -84);
		}
		if (i >= -34) {
			return null;
		}
		return model;
	}

	final String method1684(String string, int i, int i_54_) {
		anInt1881++;
		if (clientScriptData == null) {
			return string;
		}
		Node_Sub18 node_sub18 = (Node_Sub18) clientScriptData.method1518(3512, (long) i_54_);
		if (i != -32525) {
			return null;
		}
		if (node_sub18 == null) {
			return string;
		}
		return node_sub18.aString7149;
	}

	final Model method1685(boolean bool, TemporaryItemDefinition class38, int i) {
		anInt1848++;
		int i_55_;
		int i_56_;
		if (!bool) {
			if (class38 != null && class38.anIntArray564 != null) {
				i_55_ = class38.anIntArray564[0];
				i_56_ = class38.anIntArray564[1];
			} else {
				i_56_ = maleDialogueHat;
				i_55_ = maleDialogueModel;
			}
		} else if (class38 == null || class38.anIntArray568 == null) {
			i_55_ = femaleDialogueModel;
			i_56_ = femaleDialogueHat;
		} else {
			i_56_ = class38.anIntArray568[1];
			i_55_ = class38.anIntArray568[0];
		}
		if ((i_55_ ^ 0xffffffff) == 0) {
			return null;
		}
		if (i > -33) {
			return null;
		}
		Model model = Renderer.method3448(i_55_, 7, 0, aClass86_1868.aClass302_1168);
		if (model.anInt2614 < 13) {
			model.method2081(2, 0);
		}
		if (i_56_ != -1) {
			Model model_57_ = Renderer.method3448(i_56_, 7, 0, aClass86_1868.aClass302_1168);
			if ((model_57_.anInt2614 ^ 0xffffffff) > -14) {
				model_57_.method2081(2, 0);
			}
			Model[] models = { model, model_57_ };
			model = new Model(models, 2);
		}
		if (originalModelColors != null) {
			short[] ses;
			if (class38 == null || class38.modifiedModelColors == null) {
				ses = modifiedModelColors;
			} else {
				ses = class38.modifiedModelColors;
			}
			for (int i_58_ = 0; (i_58_ ^ 0xffffffff) > (originalModelColors.length ^ 0xffffffff); i_58_++)
				model.method2089(originalModelColors[i_58_], ses[i_58_], 115);
		}
		if (originalTextureColors != null) {
			short[] ses;
			if (class38 == null || class38.modifiedTextureColors == null) {
				ses = modifiedTextureColors;
			} else {
				ses = class38.modifiedTextureColors;
			}
			for (int i_59_ = 0; (originalTextureColors.length ^ 0xffffffff) < (i_59_ ^ 0xffffffff); i_59_++)
				model.method2087(originalTextureColors[i_59_], ses[i_59_], 101);
		}
		return model;
	}

	final boolean method1686(boolean bool, TemporaryItemDefinition class38, int i) {
		anInt1885++;
		int i_60_;
		int i_61_;
		int i_62_;
		if (bool) {
			if (class38 == null || class38.femaleWornModelIds == null) {
				i_61_ = femaleEquip1;
				i_60_ = femaleEquipModelId3;
				i_62_ = femaleEquip2;
			} else {
				i_61_ = class38.femaleWornModelIds[0];
				i_62_ = class38.femaleWornModelIds[1];
				i_60_ = class38.femaleWornModelIds[2];
			}
		} else if (class38 == null || class38.maleWornModelIds == null) {
			i_60_ = maleEquipModelId3;
			i_61_ = maleEquip1;
			i_62_ = maleEquip2;
		} else {
			i_62_ = class38.maleWornModelIds[1];
			i_60_ = class38.maleWornModelIds[2];
			i_61_ = class38.maleWornModelIds[0];
		}
		if (i_61_ == -1) {
			return true;
		}
		boolean bool_64_ = true;
		if (!aClass86_1868.aClass302_1168.method3515(0, i_61_, 0)) {
			bool_64_ = false;
		}
		if (i_62_ != -1 && !aClass86_1868.aClass302_1168.method3515(0, i_62_, 0)) {
			bool_64_ = false;
		}
		if (i_60_ != -1 && !aClass86_1868.aClass302_1168.method3515(0, i_60_, 0)) {
			bool_64_ = false;
		}
		return bool_64_;
	}

	private final String method1687(int i, int i_65_) {
		if (i != 22050) {
			method1693(null, (byte) 39, null);
		}
		anInt1932++;
		if (i_65_ < 100000) {
			return "<col=ffff00>" + i_65_ + "</col>";
		}
		if ((i_65_ ^ 0xffffffff) > -10000001) {
			return "<col=ffffff>" + i_65_ / 1000 + Class22.aClass22_399.method297(aClass86_1868.anInt1161) + "</col>";
		}
		return "<col=00ff80>" + i_65_ / 1000000 + Class22.aClass22_397.method297(aClass86_1868.anInt1161) + "</col>";
	}

	private final void method1688(int i, int[] is, int i_66_) {
		if (i_66_ != -7048) {
			unknownInt14 = -54;
		}
		for (int i_67_ = 31; (i_67_ ^ 0xffffffff) < -1; i_67_--) {
			int i_68_ = 36 * i_67_;
			for (int i_69_ = 35; i_69_ > 0; i_69_--) {
				if ((is[i_69_ - -i_68_] ^ 0xffffffff) == -1 && is[i_68_ + (i_69_ + -1) - 36] != 0) {
					is[i_69_ + i_68_] = i;
				}
			}
		}
		anInt1907++;
	}

	final DrawableModel method1689(Animator animator, int i, PlayerDefinition playerdefinition, int i_70_, GraphicsToolkit graphicstoolkit, int i_71_) {
		anInt1906++;
		if (stackIds != null && (i_70_ ^ 0xffffffff) < -2) {
			int i_72_ = -1;
			for (int i_73_ = 0; i_73_ < 10; i_73_++) {
				if ((i_70_ ^ 0xffffffff) <= (stackAmounts[i_73_] ^ 0xffffffff) && (stackAmounts[i_73_] ^ 0xffffffff) != -1) {
					i_72_ = stackIds[i_73_];
				}
			}
			if (i_72_ != -1) {
				return aClass86_1868.getItemDefinitionForId(i_72_).method1689(animator, i, playerdefinition, 1, graphicstoolkit, 87);
			}
		}
		int i_74_ = i;
		if (animator != null) {
			i_74_ |= animator.method237((byte) -128);
		}
		DrawableModel drawablemodel;
		synchronized (aClass86_1868.aClass61_1176) {
			drawablemodel = (DrawableModel) aClass86_1868.aClass61_1176.method607((long) (anInt1914 | graphicstoolkit.anInt1537 << 29), 0);
		}
		if (i_71_ <= 64) {
			return null;
		}
		if (drawablemodel == null || (graphicstoolkit.b(drawablemodel.ua(), i_74_) ^ 0xffffffff) != -1) {
			if (drawablemodel != null) {
				i_74_ = graphicstoolkit.c(i_74_, drawablemodel.ua());
			}
			int i_75_ = i_74_;
			if (originalTextureColors != null) {
				i_75_ |= 0x8000;
			}
			if (originalModelColors != null || playerdefinition != null) {
				i_75_ |= 0x4000;
			}
			if ((modelVerticesX ^ 0xffffffff) != -129) {
				i_75_ |= 0x1;
			}
			if ((modelVerticesX ^ 0xffffffff) != -129) {
				i_75_ |= 0x2;
			}
			if (modelVerticesX != 128) {
				i_75_ |= 0x4;
			}
			Model model = Renderer.method3448(modelId, 7, 0, aClass86_1868.aClass302_1168);
			if (model == null) {
				return null;
			}
			if ((model.anInt2614 ^ 0xffffffff) > -14) {
				model.method2081(2, 0);
			}
			drawablemodel = graphicstoolkit.a(model, i_75_, aClass86_1868.anInt1181, 64 + modelLighting, 850 - -modelShadowing);
			if ((modelVerticesX ^ 0xffffffff) != -129 || modelVerticesY != 128 || (modelVerticesZ ^ 0xffffffff) != -129) {
				drawablemodel.O(modelVerticesX, modelVerticesY, modelVerticesZ);
			}
			if (originalModelColors != null) {
				for (int i_76_ = 0; originalModelColors.length > i_76_; i_76_++) {
					if (recolourPallete == null || (recolourPallete.length ^ 0xffffffff) >= (i_76_ ^ 0xffffffff)) {
						drawablemodel.ia(originalModelColors[i_76_], modifiedModelColors[i_76_]);
					} else {
						drawablemodel.ia(originalModelColors[i_76_], Class129.aShortArray1665[recolourPallete[i_76_] & 0xff]);
					}
				}
			}
			if (originalTextureColors != null) {
				for (int i_77_ = 0; (originalTextureColors.length ^ 0xffffffff) < (i_77_ ^ 0xffffffff); i_77_++)
					drawablemodel.aa(originalTextureColors[i_77_], modifiedTextureColors[i_77_]);
			}
			if (playerdefinition != null) {
				for (int i_78_ = 0; (i_78_ ^ 0xffffffff) > -11; i_78_++) {
					for (int i_79_ = 0; (Class45.aShortArrayArray5265[i_78_].length ^ 0xffffffff) < (i_79_ ^ 0xffffffff); i_79_++) {
						if ((Class117_Sub2.aShortArrayArrayArray5151[i_78_][i_79_].length ^ 0xffffffff) < (playerdefinition.anIntArray3430[i_78_] ^ 0xffffffff)) {
							drawablemodel.ia(Class45.aShortArrayArray5265[i_78_][i_79_], Class117_Sub2.aShortArrayArrayArray5151[i_78_][i_79_][playerdefinition.anIntArray3430[i_78_]]);
						}
					}
				}
			}
			drawablemodel.s(i_74_);
			synchronized (aClass86_1868.aClass61_1176) {
				aClass86_1868.aClass61_1176.method601(drawablemodel, 25566, (long) (anInt1914 | graphicstoolkit.anInt1537 << 29));
			}
		}
		if (animator != null) {
			drawablemodel = drawablemodel.method633((byte) 1, i_74_, true);
			animator.method225(0, drawablemodel, 0);
		}
		drawablemodel.s(i);
		return drawablemodel;
	}

	static final void method1690(byte b) {
		Class274.method3325((Class213.aNode_Sub27_2512.aClass320_Sub17_7311.method3747(false) ^ 0xffffffff) == -2, 122, 22050, 2);
		if (b <= -102) {
			anInt1903++;
			AnimableAnimator.aClass42_5498 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 0, 22050, Node_Sub38_Sub20.aCanvas10309);
			AnimableAnimator_Sub1.method256(true, 1405, Class32.method359(null, -9293));
			Packet.aClass42_9402 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 1, 2048, Node_Sub38_Sub20.aCanvas10309);
			Class176.aNode_Sub9_Sub3_2106 = new Node_Sub9_Sub3();
			Packet.aClass42_9402.method441(11757, Class176.aNode_Sub9_Sub3_2106);
			Class361.aClass191_4486 = new Class191(22050, Class365.anInt4523);
			EntityNode_Sub7.method979(17285);
		}
	}

	final void method1691(byte b) {
		if (b <= 77) {
			showInGrandExchange = true;
		}
		anInt1910++;
	}

	final boolean method1692(int i, TemporaryItemDefinition class38, boolean bool) {
		anInt1921++;
		int i_80_;
		int i_81_;
		if (bool) {
			if (class38 == null || class38.anIntArray568 == null) {
				i_81_ = femaleDialogueModel;
				i_80_ = femaleDialogueHat;
			} else {
				i_81_ = class38.anIntArray568[0];
				i_80_ = class38.anIntArray568[1];
			}
		} else if (class38 != null && class38.anIntArray564 != null) {
			i_80_ = class38.anIntArray564[1];
			i_81_ = class38.anIntArray564[0];
		} else {
			i_80_ = maleDialogueHat;
			i_81_ = maleDialogueModel;
		}
		if (i_81_ == -1) {
			return true;
		}
		boolean bool_82_ = true;
		if (!aClass86_1868.aClass302_1168.method3515(i, i_81_, 0)) {
			bool_82_ = false;
		}
		if ((i_80_ ^ 0xffffffff) != 0 && !aClass86_1868.aClass302_1168.method3515(0, i_80_, 0)) {
			bool_82_ = false;
		}
		return bool_82_;
	}

	final void method1693(ItemDefinitions itemdefinition_83_, byte b, ItemDefinitions realItem) {
		value = 0;
		maleEquipModelId3 = realItem.maleEquipModelId3;
		stackable = realItem.stackable;
		membersOnly = realItem.membersOnly;
		recolourPallete = realItem.recolourPallete;
		modelOffset2 = itemdefinition_83_.modelOffset2;
		teamId = realItem.teamId;
		maleEquip2 = realItem.maleEquip2;
		inventoryOptions = new String[5];
		groundOptions = realItem.groundOptions;
		unknownInt13 = realItem.unknownInt13;
		maleDialogueModel = realItem.maleDialogueModel;
		unknownInt16 = realItem.unknownInt16;
		name = realItem.name;
		modelZoom = itemdefinition_83_.modelZoom;
		originalModelColors = realItem.originalModelColors;
		femaleDialogueHat = realItem.femaleDialogueHat;
		clientScriptData = realItem.clientScriptData;
		femaleEquip1 = realItem.femaleEquip1;
		anInt1929++;
		modelRotation1 = itemdefinition_83_.modelRotation1;
		modelRotation2 = itemdefinition_83_.modelRotation2;
		unknownInt15 = realItem.unknownInt15;
		maleDialogueHat = realItem.maleDialogueHat;
		femaleEquipModelId3 = realItem.femaleEquipModelId3;
		modifiedTextureColors = realItem.modifiedTextureColors;
		unknownInt12 = realItem.unknownInt12;
		femaleDialogueModel = realItem.femaleDialogueModel;
		modelId = itemdefinition_83_.modelId;
		modifiedModelColors = realItem.modifiedModelColors;
		femaleEquip2 = realItem.femaleEquip2;
		modelOffset1 = itemdefinition_83_.modelOffset1;
		rotationZoom = itemdefinition_83_.rotationZoom;
		if (b > -104) {
			method1687(-128, -32);
		}
		maleEquip1 = realItem.maleEquip1;
		unknownInt17 = realItem.unknownInt17;
		unknownInt14 = realItem.unknownInt14;
		equipSlot = realItem.equipSlot;
		equipType = realItem.equipType;
		originalTextureColors = realItem.originalTextureColors;
		if (realItem.inventoryOptions != null) {
			for (int i = 0; i < 4; i++)
				inventoryOptions[i] = realItem.inventoryOptions[i];
		}
		inventoryOptions[4] = Class22.aClass22_370.method297(aClass86_1868.anInt1161);
	}

	public ItemDefinitions() {
		anInt1849 = -1;
		maleEquip1 = -1;
		unknownInt24 = -1;
		maleEquip2 = -1;
		rotationZoom = 0;
		lendTemplateId = -1;
		unknownInt25 = -1;
		unknownValue2 = -1;
		maleEquipModelId3 = -1;
		modelLighting = 0;
		modelShadowing = 0;
		femaleDialogueModel = -1;
		modelZoom = 2000;
		unknownInt11 = -1;
		teamId = 0;
		membersOnly = false;
		modelVerticesY = 128;
		modelOffset1 = 0;
		name = "null";
		unknownInt23 = -1;
		modelVerticesX = 128;
		maleDialogueHat = -1;
		femaleDialogueHat = -1;
		unknownInt18 = -1;
		unknownInt20 = -1;
		unknownInt21 = -1;
		modelRotation2 = 0;
		unknownInt14 = 0;
		unknownInt19 = -1;
		unknownInt22 = -1;
		unknownInt16 = 0;
		femaleEquip2 = -1;
		modelOffset2 = 0;
		unknownInt15 = 0;
		maleDialogueModel = -1;
		unknownValue3 = 0;
		stackable = 0;
		modelVerticesZ = 128;
		femaleEquipModelId3 = -1;
		certTemplateId = -1;
		certId = -1;
		value = 1;
		dummyItem = 0;
		unknownValue1 = -1;
		modelRotation1 = 0;
		lendId = -1;
		femaleEquip1 = -1;
		unknownInt13 = 0;
		unknownInt17 = 0;
		unknownInt12 = 0;
		equipSlot = -1;
		equipType = -1;
		showInGrandExchange = true;//XXX
	}
}
