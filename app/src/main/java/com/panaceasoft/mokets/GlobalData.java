package com.panaceasoft.mokets;

import com.panaceasoft.mokets.models.PShopData;
import com.panaceasoft.mokets.models.PItemData;
import com.panaceasoft.mokets.models.PTransactionData;

import java.util.ArrayList;

/**
 * Created by Panacea-Soft on 8/2/15.
 * Contact Email : teamps.is.cool@gmail.com
 */


public class GlobalData {
    public static PItemData itemData =  null;
    public static PShopData shopdata = null;
    public static ArrayList<PShopData> shopDatas = new ArrayList<PShopData>();
    public static ArrayList<PTransactionData> transactionDatas = new ArrayList<>();
}
