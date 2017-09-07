package com.example.thanyani.vendalandtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    RecyclerAdapter adapter;
    RecyclerView recyclerView;
    VendaTour vendaTour;
    VendaTour vendaTour1;
    VendaTour vendaTour2;
    VendaTour vendaTour3;
    VendaTour vendaTour4;
    VendaTour vendaTour5;
    VendaTour vendaTour6;
    VendaTour vendaTour7;
    VendaTour vendaTour8;
    VendaTour vendaTour9;
    VendaTour vendaTour10;
    VendaTour vendaTour11;

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cardView = (CardView) findViewById(R.id.card);


        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<VendaTour> vendaTours = new ArrayList<>();
         vendaTour = new VendaTour();
        vendaTour1 = new VendaTour();
        vendaTour2 = new VendaTour();
        vendaTour3 = new VendaTour();
        vendaTour4 = new VendaTour();
        vendaTour5 = new VendaTour();
        vendaTour6 = new VendaTour();
        vendaTour7 = new VendaTour();
        vendaTour8 = new VendaTour();
        vendaTour9 = new VendaTour();
        vendaTour10 = new VendaTour();
        vendaTour11 = new VendaTour();

        vendaTour.setTopic("Waterfalls");
        vendaTour.setImage(R.drawable.wat);
        vendaTour.setText("Phiphidi Waterfall is located in rural Limpopo Province at the foothills of the Soutpansberg (Dzwaini), South Africa’s northernmost mountain range. The region’s isolation from the rest of South Africa has helped preserve the traditional cultures and belief practices of its indigenous inhabitants. Among the many tribal peoples living in Limpopo Province, about 12 percent of the population are members of the Venda linguistic group.\n" + "The vhaVenda clans of northern South Africa, in present-day Limpopo Province, are among the nation’s most traditional, hewing to rituals and practices passed down from their ancestors. Among these clans, the Ramunangi are acknowledged as the traditional custodians of Phiphidi Waterfall, a small cascade that is central to the clan’s relationship with ancestral spirits. This custodial responsibility, however, is not legally recognized, which has limited the Ramunangi’s ability to protect their sacred site from tourism development. A rock above the waterfall — one of the site’s most holy areas — was recently destroyed as part of a road-building project, and for years, the Ramunangi have been denied full access to the site to perform their rituals and custodial duties. The clan is now turning to legal measures to restore full access to Phiphidi and receive official recognition as its custodians");


        vendaTour1.setTopic("Resorts");
        vendaTour1.setImage(R.drawable.sasol);
        vendaTour1.setText("1. TSHIPISE FOREVER RESORT \n " +
                 "\n "  +
                      "Tshipise, A Forever Resort is located in Limpopo and offers three Conference Facilities that can accommodate up to 300 Delegates. All Rooms are equipped with standard Conference Equipment. The Resort offers a wide variety of Accommodation and Teambuilding activities. Delegates are sure to experience an enjoyable Conference in our breathtaking and natural surroundings.\n" +
                "\n "+
                             "FACILITIES, ACTIVITIES AND THINGS TO DO\n" +
                        "\n" +
                        "ATM\n" +
                        "Baby Pool\n" +
                        "Bowls (in season only)\n" +
                        "Convenience Store\n" +
                        "Free Wi-Fi\n" +
                        "Game Drives\n" +
                        "Horse Riding\n" +
                        "Jukskei (in season only)\n" +
                        "Kiddies Play Park\n" +
                        "Laundromat (coin operated)\n" +
                        "Liquor Store\n" +
                        "Nature Trails\n" +
                        "Organized Entertainment (in season)\n" +
                        "Putt-Putt\n" +
                        "\n" +
                        "OPEN DAILY 08:00 - 18:00.\n" +
                        "Restaurant and Bar\n" +
                        "Rheumatic Bath (indoors)\n" +
                        "Swimming Pool\n" +
                        "Tennis Courts\n" +
                        "Trampolines\n" +
                        "Volleyball (In season only)\n" +
                         "\n" +
                        "Warm Water Mineral Pool \n" +

                        "\n" +
                           "2. KHORONI HOTEL CASINO CONVENTION RESORT \n" +
                "\n" +
                           "Nestled in a lush garden setting in Thohoyandou, lies the Khoroni Hotel Casino Convention Resort. Thohoyandou is the proud heart of the VhaVenda people. Its name means “head of elephant” in tshiVenda. The exciting casino offers continuous promotional activities for all players. The 3-star Peermont Metcourt hotel offers modern accommodation, lively entertainment and excellent meeting facilities. Guests can enjoy a splendid buffet or a la carte meal at the Malingani restaurant. The Punda Maria Gate entrance of the Kruger National Park is a short drive away.\n" +
                "\n" +
                " The Khoroni casino is the most extravagant and spacious casino in Limpopo that continuously offers exciting promotional activities for all players and features smoking and non-smoking areas.\n" +
                "\n" +
                "The smoking casino has the latest video multi-line slots and Blackjack and Roulette tables.  The non-smoking casino consists of only slot machines with limited number of lower denomination machines available.  The Privé has slot machines, Blackjack and Roulette tables.\n" +
                "\n" +
                "The Khoroni Casino offers a wide spread of 150 ultra-modern slot machines in denominations that range from 2c to R10 with Bally Technology. Slots open 24 hours daily. The 8 tables offer three Blackjack tables in denominations from R25 to R1000 and five American Roulette tables from R5 to R200.\n" +
                "\n" +
                "Tables open at 10h00 every day until close. Light snack menu on offer on casino floor. The Winners Circle loyalty programme ensures that players are rewarded with exclusive promotions and offers. \n" +
                        "\n" +
                           "3. THE ELIAS RESORT\n" +
                "\n" +
                            "The Elias resort was founded in 2013 by Ramovha and Vhudele Families. It is situated at Nzhelele Tshirolwe near Jonathan Mushaathama sec school(Limpopo)\n" +
                "they host the best events, Book now and let us make your day a memorable one.\n" +
                "Africa’s premier resort is the place to be when you want to relax, enjoy and have fun, you will find a memorable experience.\n" +
                "We strive to provide the best experience and services, our excellent staff will make you feel like kings and queens.\n" +
                "Elias resort is a wonderful place that you will really enjoy, the place that help people to relax in good clean resort around venda. If you want to enjoy just go to Elias resort \n" +
                  "\n" +
                           "4. MPHEPHU RESORT\n" +
                "\n" +
                "It is located in Nzhelele sendedza. Mphephu has healing hot waters in which to relax. The natural stone, self-catering, air-conditioned chalets are fully equipped with parking next to the chalets. The resort has a caravan park with 20 stands all with electricity and hot water. Conference facilities, playground, waterslide and tuck shop also available. \n" +
                           "5. MASANA RESORT\n" +
                           "6. SAND RIVER RESORT") ;

        vendaTour2.setTopic("The Breathing Stone");
        vendaTour2.setImage(R.drawable.stone);
        vendaTour2.setText("The Breathing Stone is found in Tswime Mountain in nzhelele \n " + "Thavha ya tswime(breathing stone) is one of the popular Local Business located in Venda (Nzelele). People go there to see, enjoy and take pictures. beside the breathing stone, there is a volcano that makes the water around to be hot. there is also a resort where people go and enjoy the natural beauty and the natural hot hot water that comes from beneath.\"/>");

        vendaTour3.setTopic("Museum");
        vendaTour3.setImage(R.drawable.dzata);
        vendaTour3.setText("Dzata musium, is the museum that shows you the history of the Vhavenda people. It is based on Venda, Nzhelele Vhutuwangadzebu, next to Dzata SSecondary school. The tells about where venda people comes from and also shows how the traditional of the Vhavenda people function. There is the secret of the Vhavenda people which is called Ngoma lungundu. Its is the drum that the Vhavenda uses, for it to be used you must have a hand(person's hand, and you must never put it down because its not allowed to touch the ground because if it does, you will die");

        vendaTour4.setTopic("Nandoni Dam");
        vendaTour4.setImage(R.drawable.nandoni);
        vendaTour4.setText("Nandoni dam, now called Royal Garden \n" + "Nandoni Game Park, Resort and Golf Estate is situated around the Nandoni Dam.\n" +
                "\n" +
                "There are plenty of activities and facilities available to entertain visitors and the project aims to expand to include all of the following:\n" +
                "•Game-watching;\n" +
                "•Picnic or entertainment area for day visitors;\n" +
                "•Accommodation – Lodges, premium lodges and family chalets (still being developed);\n" +
                "•Conference centre (still being developed);\n" +
                "•Cultural village (still being developed);\n" +
                "•Caravan park;\n" +
                "•Boating;\n" +
                "•Golf Estate - Golf course and houses.\n" +
                "\n" +
                "The site was developed after the construction of the Nandoni Dam, which has created a huge lake that is a tourist attraction on its own. The land is tribal property under the jurisdiction of the chief and about 598ha of natural space is available for the project.\n" +
                "\n" +
                "The project has a good working relationship with the world renowned Kruger National Park, which is adjacent to Nandoni, about 46km distant. Government has strongly supported this project.\n");

        vendaTour5.setTopic("Game Reserve");
        vendaTour5.setImage(R.drawable.kruger);
        vendaTour5.setText("Kruger National Park \n" + "Kruger National Park is one of the largest game reserves in Africa. It covers an area of 19,485 square kilometres (7,523 sq mi) in the provinces of Limpopo and Mpumalanga in northeastern South Africa, and extends 360 kilometres (220 mi) from north to south and 65 kilometres (40 mi) from east to west. The administrative headquarters are in Skukuza. Areas of the park were first protected by the government of the South African Republic in 1898, and it became South Africa's first national park in 1926.\n" +
                "\n" +
                "To the west and south of the Kruger National Park are the two South African provinces of Limpopo and Mpumalanga. In the north is Zimbabwe, and to the east is Mozambique. It is now part of the Great Limpopo Transfrontier Park, a peace park that links Kruger National Park with the Gonarezhou National Park in Zimbabwe, and with the Limpopo National Park in Mozambique.\n" +
                "\n" +
                "The park is part of the Kruger to Canyons Biosphere an area designated by the United Nations Educational, Scientific and Cultural Organization (UNESCO) as an International Man and Biosphere Reserve (the \"Biosphere\").[6]\n");


        vendaTour6.setTopic("Accommodation");
        vendaTour6.setImage(R.drawable.masanas);
        vendaTour6.setText("There are different accommodation in venda, which are: \n" +" Nestled in a lush garden setting in Thohoyandou, lies the Khoroni Hotel Casino Convention Resort. Thohoyandou is the proud heart of the VhaVenda people. Its name means “head of elephant” in tshiVenda. The exciting casino offers continuous promotional activities for all players. The 3-star Peermont Metcourt hotel offers modern accommodation, lively entertainment and excellent meeting facilities. Guests can enjoy a splendid buffet or a la carte meal at the Malingani restaurant. The Punda Maria Gate entrance of the Kruger National Park is a short drive away. ");

        vendaTour7.setTopic("Stadium");
        vendaTour7.setImage(R.drawable.stadium);
        vendaTour7.setText("The Makwarela Stadium will be a hive of on Saturday. Three preliminary-round matches for the Nedbank Cup will be staged there.\n" +
                "\n" +
                "The programme for the day will commence with a match between the ABC Motsepe League rookies, Tshakhuma Tsha Madzivhandila (TTM), and Madridtas FC. The match will start at 09:00. It w" +
                "ill be the second time within three weeks that TTM and Madridtas will test each other’s strength. They played to a 1-1 draw at the Tshifudi Stadium in their opening league match.\n" +
                "\n" +
                "Joe Maweja and Polokwane United will meet at 11:00. The winners of the two matches will meet in the group final at 15:00.\n" +
                "\n" +
                "The other matches will be staged at the Nkowankowa Stadium in Tzaneen. Giyani Hotspurs and Boyne Young Tigers will be the first to enter the field of play at 09:00. The second match will be between Gawula Classic and Bellevue Winners Park\n");

        vendaTour8.setTopic("Casino Convention");
        vendaTour8.setImage(R.drawable.casino);
        vendaTour8.setText("Khoroni Casino Convention, is the biggest casino convention in Venda. The Slots open 24 hours daily. The 8 tables offer three Blackjack tables in denominations from R25 to R1000 and five American Roulette tables from R5 to R200.");

        vendaTour9.setTopic("Culture");
        vendaTour9.setImage(R.drawable.culture);
        vendaTour9.setText("The people who today call themselves VhaVenda are descended from a number of ancient groupings who migrated from the Great Lakes area in east-central Africa in the eleventh and twelfth centuries. Their identity gelled when a group under Chief Dimbanyika arrived at Dzata in the northern Soutpansberg, where a walled fort was later built. From here, they consolidated their power in the region, fending off attack from a number of different African groupings (including the Voortrekkers, whom they drove from their settlement at Schoemansdal in 1867).\n" +
                " Although the VhaVenda suffered a reverse at the hands of the Boers in 1898, the onset of the Anglo-Boer War prevented that victory being consolidated.\n" +
                "\n" +
                "\n" +
                "\n" +
                " The culture of the VhaVenda is a fascinating one, steeped in mysticism and vivid legend. One pervading theme is water – always an important concern in hot, seasonal climates, but a resource in which Venda is unusually abundant. Lakes, rivers, waterfalls and lush forests all form sacred sites, while legends abound of zwidutwane, or water sprites, and snakes who live at the bottom of dark pools or lakes.\n" +
                "\n" +
                "\n" +
                "\n" +
                " Many VhaVenda ceremonies and rituals still hold great importance, with the most famous being the python, or domba, dance performed by young female initiates. Naked but for jewellery and a small piece of cloth around their waists, the teenage girls form a long chain, swaying and shuffling as the “snake” winds around a fire to the sound of a beating drum – another sacred object in Venda – often for hours on end. Your chances of seeing it performed are limited. The genuine thing is most common during spring; Heritage Day around the end of August or the beginning of September is a good time for celebrations.\n");

        vendaTour10.setTopic("Town");
        vendaTour10.setImage(R.drawable.thavhani);
        vendaTour10.setText("There are different towns in venda (Shopping centers), The major ones are Musina , Thohoyandou and Louis Trichadt. Lots of people shops here and there are also some entertainment in all the town tha t are at venda. There are also lots of accommodation around the towns. the restaurants where people can go and eats with their loved ones. For those who drink alcohol there are the lounge (bars) there they will go and enjoy themselves while dancing their butts off and meeting with new friends");

        vendaTour11.setTopic("Tunnels");
        vendaTour11.setImage(R.drawable.tunnel);
        vendaTour11.setText("The Verwoerd Tunnels are situated in the town of Elim in the Limpopo Province in South Africa. The Verwoerd Tunnels are also known as the Hendrik Verwoerd Tunnels. They are known to be named after a former South African Prime Minister, Hendrik Verwoerd.\n" +
                " These tunnels are built through the Waterberg Mountains and shortens the travelling distance from Johannesburg to the border of Zimbabwe.\n" +
                "\n" +
                " The area is a well known tourist attraction. The Ben Lavin Nature Reserve is a popular attraction in this area and is a great way to spend time with the family away from the busy city lifestyle. The Arts and Crafts made by the locals in Limpopo are very popular amongst local and international visitors. ");

        vendaTours.add(vendaTour);
        vendaTours.add(vendaTour1);
        vendaTours.add(vendaTour2);



        vendaTours.add(vendaTour3);
        vendaTours.add(vendaTour4);
        vendaTours.add(vendaTour5);
        vendaTours.add(vendaTour6);
        vendaTours.add(vendaTour7);
        vendaTours.add(vendaTour8);
        vendaTours.add(vendaTour9);
        vendaTours.add(vendaTour10);
        vendaTours.add(vendaTour11);
        adapter = new RecyclerAdapter(this,vendaTours);
        recyclerView.setAdapter(adapter);


    }
}
