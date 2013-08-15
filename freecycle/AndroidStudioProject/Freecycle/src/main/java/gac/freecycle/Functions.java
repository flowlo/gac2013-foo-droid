package gac.freecycle;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by demouser on 8/15/13.
 */
public class Functions {


    public static final CharSequence[] ITEMS = {""};
    // TODO: change CATEGORIES to match categories
    static String[] CATEGORIES = new String[]{"Android", "iPhone", "Android", "iPhone", "WindowsMobile", "Android", "iPhone", "WindowsMobile", "Android", "iPhone", "WindowsMobile"};

    public static final String[] FURNITURE_LATEST_OFFER_TITLE = new String[]{
            "Dining table and 4 chairs", "Wardrobe", "Headboard", "Sofa", "Matching computer and filing cabinet", "Large leather sofa", "Child chair", "Hi-fi cabinet", "Storage unit / Table"};
    public static final String[] FURNITURE_NEAREST_OFFER_TITLE = new String[]{};
    public static final String[] FURNITURE_RECOMMENDED_OFFER_TITLE = new String[]{"Glass display unit"};
    public static final String[] FURNITURE_LATEST_REQUEST_TITLE = new String[]{"Canvas furniture", "Multiple", "Ikea Basics", "Door", "Orbital sander", "Cot", "Chest of drawers", "Wooden furniture", "Pine bedroom furniture", "Office furniture"};
    public static final String[] FURNITURE_NEAREST_REQUEST_TITLE = new String[]{};
    public static final String[] FURNITURE_RECOMMENDED_REQUEST_TITLE = new String[]{};

    public static final String[] FURNITURE_LATEST_OFFER_LOCATION = new String[]{"52.400946,0.263232", "51.528642,-0.101599", "51.452683,-2.588997", "56.116523,-3.936903", "40.416271,-91.135779", "51.49636,-0.14308", "43.133897,-88.222037", "53.04304,-2.992494", "53.645708,-3.010113"};
    public static final String[] FURNITURE_NEAREST_OFFER_LOCATION = new String[]{};
    public static final String[] FURNITURE_RECOMMENDED_OFFER_LOCATION = new String[]{"54.978252,-1.61778"};
    public static final String[] FURNITURE_LATEST_REQUEST_LOCATION = new String[]{"53.381129,-1.470085", "51.375801,-2.359904", "51.481581,-3.17909", "51.501364,-0.14189", "54.597285,-5.93012", "53.349805,-6.26031", "53.479324,-2.248485", "53.801279,-1.548567", "52.636878,-1.139759", "51.503324,-0.119543"};
    public static final String[] FURNITURE_NEAREST_REQUEST_LOCATION = new String[]{};
    public static final String[] FURNITURE_RECOMMENDED_REQUEST_LOCATION = new String[]{};

    public static final String[] FURNITURE_LATEST_OFFER_DESCRIPTION = new String[]{"'Mahogany effect dining table and four chairs offered. Table is 90cm square, with two extendable flaps of 30cm each. Height 74cm. Chairs have pink fabric seats. They are all well-used with marks, scratches etc, but still have life left in them. Can send a photo if required. Table legs have been removed for ease of transportation and simply screw back on. '", "to kit out a student room. will recycle after 10 months.", "Headboard needed for 3ft adult bed", "7' x 3' Furniture Village sofa, approx 5 years old. Slight tear in middle section but otherwise in good condition. I removed the fire safety label when it arrived because it was unsightly, which means that charity shops will not accept it. Collection only.", "'Solid pine computer desk, 120cm wide, 20cm deep, 73cm high, with slide-out keyboard shelf. Also, matching filing cabinet on castors, which has a single drawer for suspension files and a locakble drawer for pens, etc. Suspension files along with the cabinet. All in good condition, a couple of minor scuffs and scratches, but as it's solid wood, these could be coaxed away with a bit of fine wire wool and wax polish or such like, if bothered. Sturdy, with solid side panels (ie, as legs) joined with a half-height solid board at the back. Can put a tower style computer underneath if the cabinet is not sitting there. Bought it at John Lewis some years back, reluctantly passing it on as a different furniture layout and style coming in. So, it's natural pine colour, yellowed down a bit with age and sunlight, with a matt glaze finish on the wood.'", "'Large leather sofa - dark brown, very good condition 2.4 m long, a substantial piece of furniture. Can email photo if anyone is interested.'", "Child Upright Pine Slatted Chair. Seat height 30 cm. Width 27 cm.", " The hi-fi unit is: 125cm wide, 50cm high (incl wheels), and 50cm deep and comes with 3 drawers, and a shelf that pulls out. (i have removed this to fit my hi-fi in, but it screws back in!) ", "The storage unit is: 88cm wide, 55cm high (incl wheels), and 49cm deep. The top swivels and folds out to make a table top, twice the size of when its folded. It also has a door on the side. It also comes with 2 small tables which slot in to the gap. (see pics) I have a 42' TV on it, so its plenty big enough for most tv's these days."};
    public static final String[] FURNITURE_NEAREST_OFFER_DESCRIPTION = new String[]{};
    public static final String[] FURNITURE_RECOMMENDED_OFFER_DESCRIPTION = new String[]{"The glass display cabinet is: 87cm high, 173cm high, and 45cm deep"};
    public static final String[] FURNITURE_LATEST_REQUEST_DESCRIPTION = new String[]{"'Does anyone have any canvas bedroom furniture they no longer need, we've moved to an unfurnished place and don't have any bedroom furniture.'", "'My mum is a support worker for a women's refuge and knows of a woman who has just been housed with her 1 year old girl, with only an airbed and a cot. My mum is hoping to get authorisation from her manager tomorrow to use a man with a van one night next week to collect any items that anyone could donate for her. Of importance are: bed, table and chairs, sofas, bedroom furniture, white goods.'", "I'm looking for any Ikea furniture (tables, chairs, lamps etc) or similar.", "Internal 6 panel door with door furniture 1970mm x 765mm. Painted white.", "'Needed for refinishing a few bits of furniture. Not the sort that takes a rectangular bit of sandpaper and vibrates it a bit, but the sort that spins a circular pad while wobbling it at the same time.'", "'My brother is coming over from Australia for an extended visit, and unsurprisingly, has had to leave some larger pieces of furniture behind. One such item is a cot for his 12m old son. Apparently, my nephew is not quite ready for a 'big-boy bed' as he is quite small for his age. Given that I work as a rep, covering Cambs, Norfolk, Suffolk and Essex, I am able to travel to pick up a suitable item. It just needs to fit into an Audi A4! If anyone can help, I would appreciate it. Of course, given that my own son is 19, the cot would be Freecycled again, once it is no longer required.'", "'After suffering from terrible damp over the winter our housing association has finally fixed the problem however they refused to replace our bedroom furniture.We now have wardrobes but still need a large chest of drawers if anyone has one they no longer need please.'", "Needed for restoration and decoupaging project.", "'Hi, I'm asking if anyone has any unwanted pine bedroom furniture at all, I am able to collect, thank you on advance'", "'Hi, I am making a new office in a smallish room and would be very grateful for an unwanted desk, desk chair, filing cabinet and any other office bits and pieces. Many thanks Amanda'"};
    public static final String[] FURNITURE_NEAREST_REQUEST_DESCRIPTION = new String[]{};
    public static final String[] FURNITURE_RECOMMENDED_REQUEST_DESCRIPTION = new String[]{};


    public static final String[] GARDEN_LATEST_OFFER_TITLE = new String[]{"Wooden garden furniture", "Greenhouse", "Soil", "Soil", "Plant pots", "Broken hedge trimmer", "Leaf vacuum", "Greenhouse"};
    public static final String[] GARDEN_NEAREST_OFFER_TITLE = new String[]{};
    public static final String[] GARDEN_RECOMMENDED_OFFER_TITLE = new String[]{};
    public static final String[] GARDEN_LATEST_REQUEST_TITLE = new String[]{};
    public static final String[] GARDEN_NEAREST_REQUEST_TITLE = new String[]{};
    public static final String[] GARDEN_RECOMMENDED_REQUEST_TITLE = new String[]{};

    public static final String[] GARDEN_LATEST_OFFER_LOCATION = new String[]{"52.205337,0.121817", "51.752021,-1.257726", "52.772099,-1.206166", "60.493689,-1.381707", "54.236107,-4.548056", "50.692718,-1.31671", "51.278708,0.521725", "51.296407,-0.33112"};
    public static final String[] GARDEN_NEAREST_OFFER_LOCATION = new String[]{};
    public static final String[] GARDEN_RECOMMENDED_OFFER_LOCATION = new String[]{};
    public static final String[] GARDEN_LATEST_REQUEST_LOCATION = new String[]{};
    public static final String[] GARDEN_NEAREST_REQUEST_LOCATION = new String[]{};
    public static final String[] GARDEN_RECOMMENDED_REQUEST_LOCATION = new String[]{};

    public static final String[] GARDEN_LATEST_OFFER_DESCRIPTION = new String[]{"'OFFERED: round folding wooden table (about 90cm diameter) and 4 folding wooden chairs. Table leg is rotten and needs repair and the whole set really needs painting/ treating. '", "'We inherited this glass house and have never had a chance to put it together. We think it's in good shape, though probably missing a couple of panes. We think it is 6'x12'.'", "'170 litres approx of topsoil, currently in two collapsible bins like this http://www.amazon.co.uk/Silverline-589689-56-Pop-Sack/dp/B000LFVTA4/ but they have been outside for a few years and will probably perish when lifted! Collect from CB1/Coleridge, bring suitable receptacle. Bridget'", "'A trailer full of soil. Am happy to deliver within ten miles of Cambridge. Thanks Rachel '", "'2 large plastic sacks of pots of various sizes and shapes most bigger than 10cms. David '", "'On offer is an electric hedge trimmer with cable extension. It was used a couple of years ago but when I tried it recently it didn't work but if anyone knows what they are doing, they would probably be able to mend it. Please let me know when you can collect it.'", "'Wheeled leaf vac with built in leaf shredder. Very noisy and I've never found it very effective, but you may have better luck with it.'", "'On offer is a mini-greenhouse in generally good repair, just one small tear in one side (ventilation?!). It was bought this year and not really used. Have collapsed it ready for collection. This is the shop and model purchased: http://www.notcutts.co.uk/4-tier-mini-greenhouse/notcutts/fcp-product/10984'"};
    public static final String[] GARDEN_NEAREST_OFFER_DESCRIPTION = new String[]{};
    public static final String[] GARDEN_RECOMMENDED_OFFER_DESCRIPTION = new String[]{};
    public static final String[] GARDEN_LATEST_REQUEST_DESCRIPTION = new String[]{};
    public static final String[] GARDEN_NEAREST_REQUEST_DESCRIPTION = new String[]{};
    public static final String[] GARDEN_RECOMMENDED_REQUEST_DESCRIPTION = new String[]{};

    public static final String[] PETS_LATEST_OFFER_TITLE = new String[]{};
    public static final String[] PETS_NEAREST_OFFER_TITLE = new String[]{};
    public static final String[] PETS_RECOMMENDED_OFFER_TITLE = new String[]{};
    public static final String[] PETS_LATEST_REQUEST_TITLE = new String[]{};
    public static final String[] PETS_NEAREST_REQUEST_TITLE = new String[]{};
    public static final String[] PETS_RECOMMENDED_REQUEST_TITLE = new String[]{};

    public static final String[] PETS_LATEST_OFFER_LOCATION = new String[]{};
    public static final String[] PETS_NEAREST_OFFER_LOCATION = new String[]{};
    public static final String[] PETS_RECOMMENDED_OFFER_LOCATION = new String[]{};
    public static final String[] PETS_LATEST_REQUEST_LOCATION = new String[]{};
    public static final String[] PETS_NEAREST_REQUEST_LOCATION = new String[]{};
    public static final String[] PETS_RECOMMENDED_REQUEST_LOCATION = new String[]{};

    public static final String[] PETS_LATEST_OFFER_DESCRIPTION = new String[]{};
    public static final String[] PETS_NEAREST_OFFER_DESCRIPTION = new String[]{};
    public static final String[] PETS_RECOMMENDED_OFFER_DESCRIPTION = new String[]{};
    public static final String[] PETS_LATEST_REQUEST_DESCRIPTION = new String[]{};
    public static final String[] PETS_NEAREST_REQUEST_DESCRIPTION = new String[]{};
    public static final String[] PETS_RECOMMENDED_REQUEST_DESCRIPTION = new String[]{};

    public static boolean setUpDefault(Context context){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
//        pref.edit().putBoolean().commit();
        return true;
    }
}
