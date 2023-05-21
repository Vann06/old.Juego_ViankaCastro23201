import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound musicaFondo;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
        musicaFondo = new GreenfootSound("musica.wav");
    }
    public void act()
    {
        if(!musicaFondo.isPlaying())
        {
            musicaFondo.play();
            musicaFondo.setVolume(18);

        }
    
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Walls walls = new Walls();
        addObject(walls,27,772);
        walls.setLocation(36,768);
        Walls walls2 = new Walls();
        addObject(walls2,23,726);
        Walls walls3 = new Walls();
        addObject(walls3,22,676);
        Walls walls4 = new Walls();
        addObject(walls4,21,625);
        Walls walls5 = new Walls();
        addObject(walls5,22,574);
        Walls walls6 = new Walls();
        addObject(walls6,21,525);
        Walls walls7 = new Walls();
        addObject(walls7,21,472);
        Walls walls8 = new Walls();
        addObject(walls8,21,421);
        Walls walls9 = new Walls();
        addObject(walls9,20,372);
        Walls walls10 = new Walls();
        addObject(walls10,19,322);
        Walls walls11 = new Walls();
        addObject(walls11,18,271);
        Walls walls12 = new Walls();
        addObject(walls12,17,217);
        walls12.setLocation(25,210);
        Walls walls13 = new Walls();
        addObject(walls13,17,172);
        Walls walls14 = new Walls();
        addObject(walls14,17,120);
        walls14.setLocation(28,111);
        Walls walls15 = new Walls();
        addObject(walls15,15,74);
        Walls walls16 = new Walls();
        addObject(walls16,14,22);
        Walls walls17 = new Walls();
        addObject(walls17,64,22);
        Walls walls18 = new Walls();
        addObject(walls18,114,21);
        Walls walls19 = new Walls();
        addObject(walls19,162,18);
        Walls walls20 = new Walls();
        addObject(walls20,209,17);
        Walls walls21 = new Walls();
        addObject(walls21,258,18);
        Walls walls22 = new Walls();
        addObject(walls22,307,19);
        Walls walls23 = new Walls();
        addObject(walls23,356,18);
        Walls walls24 = new Walls();
        addObject(walls24,405,19);
        Walls walls25 = new Walls();
        addObject(walls25,452,20);
        Walls walls26 = new Walls();
        addObject(walls26,500,19);
        Walls walls27 = new Walls();
        addObject(walls27,547,19);
        Walls walls28 = new Walls();
        addObject(walls28,594,18);
        Walls walls29 = new Walls();
        addObject(walls29,643,18);
        Walls walls30 = new Walls();
        addObject(walls30,691,18);
        Walls walls31 = new Walls();
        addObject(walls31,738,18);
        Walls walls32 = new Walls();
        addObject(walls32,781,20);
        Walls walls33 = new Walls();
        addObject(walls33,777,154);
        Walls walls34 = new Walls();
        addObject(walls34,776,204);
        Walls walls35 = new Walls();
        addObject(walls35,775,252);
        Walls walls36 = new Walls();
        addObject(walls36,776,299);
        Walls walls37 = new Walls();
        addObject(walls37,774,351);
        Walls walls38 = new Walls();
        addObject(walls38,775,398);
        Walls walls39 = new Walls();
        addObject(walls39,775,447);
        Walls walls40 = new Walls();
        addObject(walls40,775,492);
        Walls walls41 = new Walls();
        addObject(walls41,777,541);
        Walls walls42 = new Walls();
        addObject(walls42,773,587);
        walls42.setLocation(781,580);
        Walls walls43 = new Walls();
        addObject(walls43,774,635);
        Walls walls44 = new Walls();
        addObject(walls44,773,682);
        Walls walls45 = new Walls();
        addObject(walls45,771,728);
        Walls walls46 = new Walls();
        addObject(walls46,773,775);
        walls45.setLocation(774,733);
        Walls walls47 = new Walls();
        addObject(walls47,179,774);
        Walls walls48 = new Walls();
        addObject(walls48,228,774);
        Walls walls49 = new Walls();
        addObject(walls49,277,773);
        Walls walls50 = new Walls();
        addObject(walls50,327,773);
        Walls walls51 = new Walls();
        addObject(walls51,373,773);
        Walls walls52 = new Walls();
        addObject(walls52,421,772);
        Walls walls53 = new Walls();
        addObject(walls53,466,771);
        Walls walls54 = new Walls();
        addObject(walls54,515,772);
        Walls walls55 = new Walls();
        addObject(walls55,566,772);
        Walls walls56 = new Walls();
        addObject(walls56,615,771);
        Walls walls57 = new Walls();
        addObject(walls57,663,771);
        Walls walls58 = new Walls();
        addObject(walls58,716,771);
        Walls walls59 = new Walls();
        addObject(walls59,180,721);
        Walls walls60 = new Walls();
        addObject(walls60,183,671);
        Walls walls61 = new Walls();
        addObject(walls61,180,624);
        Walls walls62 = new Walls();
        addObject(walls62,179,570);
        walls62.setLocation(184,555);
        Walls walls63 = new Walls();
        addObject(walls63,178,529);
        Walls walls64 = new Walls();
        addObject(walls64,174,477);
        Walls walls65 = new Walls();
        addObject(walls65,223,478);
        walls64.setLocation(239,620);
        walls65.setLocation(271,605);
        Walls walls66 = new Walls();
        addObject(walls66,326,619);
        Walls walls67 = new Walls();
        addObject(walls67,66,373);
        Walls walls68 = new Walls();
        addObject(walls68,115,374);
        Walls walls69 = new Walls();
        addObject(walls69,165,371);
        Walls walls70 = new Walls();
        addObject(walls70,216,371);
        Walls walls71 = new Walls();
        addObject(walls71,305,67);
        Walls walls72 = new Walls();
        addObject(walls72,305,115);
        Walls walls73 = new Walls();
        addObject(walls73,304,159);
        Walls walls74 = new Walls();
        addObject(walls74,303,209);
        Walls walls75 = new Walls();
        addObject(walls75,302,255);
        Walls walls76 = new Walls();
        addObject(walls76,351,258);
        Walls walls77 = new Walls();
        addObject(walls77,400,257);
        Walls walls78 = new Walls();
        addObject(walls78,446,257);
        Walls walls79 = new Walls();
        addObject(walls79,496,257);
        Walls walls80 = new Walls();
        addObject(walls80,455,207);
        Walls walls81 = new Walls();
        addObject(walls81,453,153);
        walls81.setLocation(461,160);
        Walls walls82 = new Walls();
        addObject(walls82,658,721);
        Walls walls83 = new Walls();
        addObject(walls83,658,668);
        walls83.setLocation(660,659);
        Walls walls84 = new Walls();
        addObject(walls84,657,623);
        Walls walls85 = new Walls();
        addObject(walls85,652,572);
        walls85.setLocation(659,560);
        Walls walls86 = new Walls();
        addObject(walls86,657,523);
        Walls walls87 = new Walls();
        addObject(walls87,600,523);
        Walls walls88 = new Walls();
        addObject(walls88,549,524);
        Walls walls89 = new Walls();
        addObject(walls89,498,522);
        Walls walls90 = new Walls();
        addObject(walls90,498,304);
        Walls walls91 = new Walls();
        addObject(walls91,498,354);
        Walls walls92 = new Walls();
        addObject(walls92,64,172);
        Walls walls93 = new Walls();
        addObject(walls93,112,172);
        Walls walls94 = new Walls();
        addObject(walls94,162,171);
        Walls walls95 = new Walls();
        addObject(walls95,116,219);
        walls75.setLocation(305,255);
        Walls walls96 = new Walls();
        addObject(walls96,723,251);
        Walls walls97 = new Walls();
        addObject(walls97,670,247);
        walls97.setLocation(681,260);
        Walls walls98 = new Walls();
        addObject(walls98,623,250);
        Walls walls99 = new Walls();
        addObject(walls99,621,300);
        Walls walls100 = new Walls();
        addObject(walls100,618,347);
        Walls walls101 = new Walls();
        addObject(walls101,617,395);
        Walls walls102 = new Walls();
        addObject(walls102,638,67);
        Walls walls103 = new Walls();
        addObject(walls103,590,66);
        Walls walls104 = new Walls();
        addObject(walls104,728,198);
        Walls walls105 = new Walls();
        addObject(walls105,678,197);
        Walls walls106 = new Walls();
        addObject(walls106,375,620);
        Walls walls107 = new Walls();
        addObject(walls107,230,519);
        walls107.setLocation(212,526);
        Walls walls108 = new Walls();
        addObject(walls108,273,522);
        Walls walls109 = new Walls();
        addObject(walls109,263,372);
        Walls walls110 = new Walls();
        addObject(walls110,68,422);
        Walls walls111 = new Walls();
        addObject(walls111,250,66);
        Walls walls112 = new Walls();
        addObject(walls112,251,111);
        Walls walls113 = new Walls();
        addObject(walls113,323,517);
        walls113.setLocation(308,523);
        walls89.setLocation(498,521);
        walls106.setLocation(505,567);
        walls66.setLocation(510,613);
        walls65.setLocation(490,667);
        walls64.setLocation(309,379);
        walls112.setLocation(250,103);
        walls111.setLocation(260,70);
        walls63.setLocation(240,589);
        walls107.setLocation(280,595);
        walls60.setLocation(387,525);
        walls59.setLocation(384,651);
        walls108.setLocation(276,549);
        walls113.setLocation(274,494);
        walls60.setLocation(322,475);
        walls59.setLocation(314,720);
        Walls walls114 = new Walls();
        addObject(walls114,314,720);
        walls59.setLocation(373,716);
        walls114.setLocation(369,723);
        walls81.setLocation(439,176);
        Walls walls115 = new Walls();
        addObject(walls115,373,677);
        walls86.setLocation(667,516);
        walls114.act();
        walls14.setLocation(27,133);
        walls81.setLocation(462,154);
        walls81.setLocation(451,156);
        removeObject(walls81);
        walls.setLocation(33,776);
        walls61.setLocation(178,623);
        walls62.setLocation(174,577);
        walls63.setLocation(187,530);
        walls107.setLocation(214,522);
        walls108.setLocation(266,539);
        walls113.setLocation(271,497);
        walls108.setLocation(271,546);
        walls108.setLocation(273,552);
        walls113.setLocation(273,494);
        walls60.setLocation(329,502);
        walls12.setLocation(12,234);
        walls80.setLocation(461,203);
        walls112.setLocation(246,132);
        walls97.setLocation(678,280);
        walls97.setLocation(678,259);
        removeObject(walls97);
        walls82.setLocation(662,696);
        walls83.setLocation(660,678);
        walls85.setLocation(668,565);
        walls86.setLocation(659,526);
        walls87.setLocation(602,529);
        walls88.setLocation(541,530);
        walls89.setLocation(480,527);
        walls106.setLocation(497,565);
        walls66.setLocation(513,616);
        walls65.setLocation(511,654);
        walls59.setLocation(388,622);
        walls59.setLocation(388,714);
        walls115.setLocation(385,678);
        walls60.setLocation(327,479);
        walls64.setLocation(314,371);
        walls80.setLocation(456,221);
        walls99.setLocation(615,304);
        walls100.setLocation(621,337);
        walls101.setLocation(627,390);
        walls36.setLocation(777,322);
        walls42.setLocation(774,575);
        walls80.setLocation(455,216);
        walls80.setLocation(466,216);
        removeObject(walls80);
        walls115.setLocation(365,601);
        walls59.setLocation(387,671);
        walls59.setLocation(363,665);
        walls115.setLocation(372,613);
        walls114.setLocation(365,700);
        walls59.setLocation(363,683);
        walls115.setLocation(362,606);
        walls112.setLocation(244,120);
        walls96.setLocation(735,248);
        walls14.setLocation(26,130);
        walls112.setLocation(260,122);
        walls59.setLocation(370,714);
        walls59.setLocation(359,661);
        walls115.setLocation(371,622);
        walls98.setLocation(625,263);
        walls99.setLocation(630,305);
        walls93.setLocation(90,196);
        oso oso = new oso();
        addObject(oso,90,196);
        michi michi = new michi();
        addObject(michi,109,736);
        boost boost = new boost();
        addObject(boost,362,125);
        walls14.setLocation(10,116);
        boost boost2 = new boost();
        addObject(boost2,75,90);
        boost boost3 = new boost();
        addObject(boost3,581,593);
        walls115.setLocation(382,571);
        walls59.setLocation(376,629);
        walls114.setLocation(372,700);
        walls.setLocation(13,798);
        walls.setLocation(21,785);
        walls12.setLocation(24,224);
        walls95.setLocation(121,268);
        oso.setLocation(88,280);
        walls95.setLocation(114,232);
        removeObject(walls95);
        walls93.setLocation(118,174);
        walls112.setLocation(251,132);
        walls115.setLocation(369,599);
        oso oso2 = new oso();
        addObject(oso2,82,470);
        walls60.setLocation(333,499);
        walls59.setLocation(368,678);
        walls115.setLocation(363,591);
        walls60.setLocation(348,513);
        walls113.setLocation(288,500);
        walls108.setLocation(287,558);
        walls107.setLocation(234,553);
        walls107.setLocation(223,552);
        walls63.setLocation(179,546);
        walls62.setLocation(181,595);
        walls61.setLocation(185,652);
        walls89.setLocation(488,519);
        walls106.setLocation(471,585);
        walls66.setLocation(487,628);
        walls65.setLocation(491,685);
        walls86.setLocation(651,519);
        walls98.setLocation(623,240);
        walls99.setLocation(627,304);
        walls100.setLocation(626,353);
        walls100.setLocation(626,388);
        walls36.setLocation(771,284);
        walls42.setLocation(778,588);
        walls88.setLocation(542,527);
        walls87.setLocation(576,530);
        walls86.setLocation(626,528);
        walls85.setLocation(644,584);
        walls84.setLocation(651,640);
        walls82.setLocation(653,677);
        walls82.setLocation(661,729);
        walls85.setLocation(640,570);
        walls84.setLocation(643,624);
        walls83.setLocation(638,663);
        walls82.setLocation(638,706);
        walls58.setLocation(729,777);
        oso oso3 = new oso();
        addObject(oso3,712,695);
        michi.setLocation(105,776);
        walls60.setLocation(335,502);
        walls49.setLocation(269,761);
        walls66.setLocation(484,636);
        walls65.setLocation(483,669);
        boost boost4 = new boost();
        addObject(boost4,695,303);
        lloro lloro = new lloro(true);
        addObject(lloro,469,131);
        lloro lloro2 = new lloro(false);
        addObject(lloro2,153,206);
        oso.setLocation(125,298);
        walls49.setLocation(271,760);
        walls114.setLocation(383,736);
        walls59.setLocation(381,676);
        walls115.setLocation(385,640);
        walls66.setLocation(484,620);
        walls89.setLocation(481,527);
        walls106.setLocation(484,561);
        walls106.setLocation(481,564);
        walls66.setLocation(483,615);
        walls65.setLocation(489,650);
        walls88.setLocation(520,537);
        walls88.setLocation(525,538);
        walls87.setLocation(569,536);
        walls86.setLocation(660,527);
        walls36.setLocation(774,302);
        walls99.setLocation(628,266);
        walls100.setLocation(629,317);
        walls86.setLocation(631,524);
        walls85.setLocation(633,567);
        walls85.setLocation(646,595);
        walls84.setLocation(646,617);
        walls83.setLocation(650,645);
        walls83.setLocation(649,671);
        walls82.setLocation(646,723);
        walls61.setLocation(166,638);
        walls107.setLocation(229,566);
        walls108.setLocation(279,550);
        walls113.setLocation(271,508);
        walls60.setLocation(330,503);
        walls112.setLocation(271,122);
        walls12.setLocation(34,241);
        walls12.setLocation(25,236);
        walls94.setLocation(171,155);
        Win win = new Win();
        addObject(win,756,83);
        walls49.setLocation(285,762);
        walls.setLocation(-1,759);
        lloro2.setLocation(138,238);
        walls12.setLocation(5,219);
        walls94.setLocation(165,177);
        removeObject(walls112);
        walls98.setLocation(630,231);
        removeObject(walls98);
        walls99.setLocation(634,249);
        walls100.setLocation(629,320);
        walls101.setLocation(625,354);
        walls96.setLocation(745,254);
        removeObject(walls96);
        walls86.setLocation(652,528);
        walls57.setLocation(679,774);
        walls58.setLocation(721,765);
        walls115.setLocation(397,646);
        removeObject(walls115);
        walls59.setLocation(383,608);
        walls51.setLocation(370,738);
        walls59.setLocation(375,698);
        removeObject(walls65);
        walls82.setLocation(632,736);
        walls82.setLocation(632,716);
        walls56.setLocation(616,778);
        removeObject(walls85);
        walls83.setLocation(637,653);
        walls84.setLocation(645,631);
        walls86.setLocation(631,600);
        walls86.setLocation(642,571);
        walls87.setLocation(601,542);
        walls88.setLocation(538,534);
        walls89.setLocation(500,528);
        walls66.setLocation(471,616);
        walls106.setLocation(472,585);
        walls66.setLocation(482,612);
        walls82.setLocation(655,726);
        removeObject(walls107);
        walls62.setLocation(218,587);
        walls108.setLocation(263,532);
        walls60.setLocation(294,483);
        walls113.setLocation(255,580);
        walls60.setLocation(309,476);
        walls63.setLocation(179,582);
        walls113.setLocation(257,600);
        walls61.setLocation(166,633);
        walls63.setLocation(169,602);
        walls108.setLocation(266,555);
        removeObject(walls114);
        removeObject(walls59);
        walls.setLocation(39,788);
        walls12.setLocation(19,214);
        walls12.setLocation(29,215);
        walls93.setLocation(153,172);
        walls93.setLocation(116,169);
        removeObject(walls101);
        walls100.setLocation(624,307);
        removeObject(walls50);
        walls49.setLocation(270,759);
        walls51.setLocation(365,760);
        removeObject(walls82);
        walls83.setLocation(637,724);
        walls56.setLocation(624,785);
        walls57.setLocation(669,785);
        walls58.setLocation(725,784);
        walls84.setLocation(641,653);
        walls86.setLocation(647,598);
        walls66.setLocation(495,673);
        walls66.setLocation(503,613);
        walls89.setLocation(494,561);
        walls88.setLocation(564,548);
        walls108.setLocation(277,524);
        walls113.setLocation(267,595);
        walls62.setLocation(218,579);
        walls113.setLocation(281,571);
        walls60.setLocation(319,548);
        walls61.setLocation(228,645);
        walls61.setLocation(161,645);
        walls100.setLocation(625,314);
        walls100.setLocation(624,302);
        walls99.setLocation(619,254);
        walls99.setLocation(627,251);
        walls.setLocation(25,772);
        walls.setLocation(28,767);
        walls.setLocation(22,791);
        walls.setLocation(29,771);
        walls.setLocation(35,783);
        walls.setLocation(22,780);
        walls12.setLocation(20,228);
        walls49.setLocation(270,773);
        walls51.setLocation(318,789);
        walls51.setLocation(387,775);
        walls56.setLocation(600,780);
        walls57.setLocation(654,781);
        walls113.setLocation(330,792);
        walls113.setLocation(324,748);
        walls113.setLocation(314,780);
        walls113.setLocation(321,793);
        walls113.setLocation(310,753);
        walls61.setLocation(188,676);
        walls61.setLocation(188,664);
        walls63.setLocation(184,589);
        walls63.setLocation(182,591);
        walls63.setLocation(206,606);
        walls63.setLocation(184,616);
        walls61.setLocation(198,662);
        walls61.setLocation(199,695);
        walls61.setLocation(167,638);
        walls61.setLocation(173,676);
        walls61.setLocation(177,680);
        walls63.setLocation(182,616);
        walls61.setLocation(177,655);
        walls63.setLocation(164,601);
        walls63.setLocation(176,602);
        walls62.setLocation(233,591);
        walls62.setLocation(229,601);
        walls108.setLocation(272,545);
        walls60.setLocation(276,617);
        walls60.setLocation(274,587);
        walls60.setLocation(274,588);
        walls60.setLocation(291,598);
        walls60.setLocation(275,576);
        walls60.setLocation(290,588);
        walls60.setLocation(287,615);
        walls60.setLocation(278,592);
        walls60.setLocation(254,594);
        walls60.setLocation(258,593);
        walls60.setLocation(307,608);
        walls60.setLocation(249,595);
        walls60.setLocation(323,594);
        walls60.setLocation(285,613);
        walls60.setLocation(288,587);
        walls60.setLocation(286,585);
        walls108.setLocation(289,541);
        walls60.setLocation(285,583);
        walls94.setLocation(163,141);
        walls94.setLocation(183,196);
        walls94.setLocation(151,171);
        walls94.setLocation(153,173);
        walls93.setLocation(80,154);
        walls93.setLocation(110,144);
        walls93.setLocation(90,167);
        walls93.setLocation(124,175);
        walls93.setLocation(88,175);
        walls92.setLocation(112,185);
        walls13.setLocation(23,177);
        walls14.setLocation(34,114);
        walls14.setLocation(34,139);
        walls14.setLocation(29,122);
        walls14.setLocation(22,127);
        walls92.setLocation(71,150);
        walls64.setLocation(297,391);
        walls92.setLocation(58,153);
        walls92.setLocation(73,189);
        walls92.setLocation(62,204);
        walls92.setLocation(94,161);
        walls92.setLocation(86,171);
        walls92.setLocation(87,181);
        walls92.setLocation(239,151);
        walls93.setLocation(95,161);
        walls93.setLocation(90,172);
        walls93.setLocation(81,173);
        walls93.setLocation(87,165);
        walls93.setLocation(86,181);
        walls93.setLocation(85,171);
        walls93.setLocation(84,175);
        walls94.setLocation(147,182);
        walls92.setLocation(153,171);
        walls93.setLocation(67,175);
        walls92.setLocation(109,187);
        walls92.setLocation(195,179);
        walls94.setLocation(109,199);
        walls94.setLocation(119,204);
        walls94.setLocation(118,177);
        walls94.setLocation(108,176);
        walls92.setLocation(146,164);
        walls92.setLocation(162,201);
        walls92.setLocation(147,160);
        walls92.setLocation(153,182);
        walls92.setLocation(161,174);
        walls92.setLocation(158,163);
        walls92.setLocation(143,172);
        walls92.setLocation(175,177);
        walls92.setLocation(141,156);
        walls92.setLocation(174,209);
        walls92.setLocation(152,159);
        walls92.setLocation(162,158);
        walls92.setLocation(166,174);
        walls92.setLocation(153,173);
        walls92.setLocation(156,175);
        walls111.setLocation(273,75);
        walls111.setLocation(248,63);
        walls111.setLocation(255,66);
        walls64.setLocation(338,420);
        walls64.setLocation(292,342);
        walls64.setLocation(315,412);
        walls64.setLocation(315,382);
        walls64.setLocation(320,374);
        walls64.setLocation(312,374);
        walls64.setLocation(312,379);
        walls64.setLocation(309,381);
        walls64.setLocation(310,375);
        removeObject(walls51);
        walls113.setLocation(315,748);
        walls113.setLocation(320,781);
        walls113.setLocation(330,782);
        walls113.setLocation(317,781);
        walls113.setLocation(328,782);
        walls113.setLocation(310,770);
        walls113.setLocation(314,776);
        walls52.setLocation(353,777);
        walls52.setLocation(386,775);
        walls52.setLocation(378,771);
        walls52.setLocation(362,764);
        walls52.setLocation(367,782);
        walls53.setLocation(404,781);
        walls52.setLocation(354,769);
        walls52.setLocation(356,775);
        walls54.setLocation(438,773);
        walls54.setLocation(464,773);
        walls54.setLocation(461,781);
        walls54.setLocation(454,769);
        walls54.setLocation(460,777);
        walls54.setLocation(453,772);
        walls54.setLocation(466,779);
        walls54.setLocation(447,777);
        walls55.setLocation(492,779);
        walls56.setLocation(534,781);
        walls57.setLocation(578,788);
        walls57.setLocation(581,782);
        Walls walls116 = new Walls();
        addObject(walls116,629,791);
        walls116.setLocation(644,780);
        walls116.setLocation(637,790);
        walls116.setLocation(647,766);
        walls116.setLocation(639,799);
        walls116.setLocation(611,780);
        walls57.setLocation(622,764);
        walls116.setLocation(622,764);
        walls57.setLocation(578,796);
        walls57.setLocation(640,800);
        walls116.setLocation(585,790);
        walls57.setLocation(628,783);
        walls57.setLocation(680,769);
        walls116.setLocation(585,778);
        walls57.setLocation(687,781);
        walls57.setLocation(615,789);
        walls57.setLocation(661,783);
        Walls walls117 = new Walls();
        addObject(walls117,674,783);
        walls57.setLocation(625,778);
        removeObject(walls83);
        removeObject(walls84);
        removeObject(walls86);

        addObject(walls83,625,354);
        removeObject(walls87);
        removeObject(walls88);
        removeObject(walls106);
        removeObject(walls66);
        removeObject(walls89);
        removeObject(walls108);
        removeObject(walls60);

        addObject(walls60,631,724);

        addObject(walls66,630,669);

        addObject(walls84,229,549);

        addObject(walls86,629,615);

        addObject(walls87,281,547);

        addObject(walls88,629,561);

        addObject(walls89,625,406);
        addObject(walls106,573,557);
        boost3.setLocation(577,620);
        addObject(walls108,516,556);
        walls106.setLocation(578,553);
        Walls walls118 = new Walls();
        addObject(walls118,511,609);
        walls106.setLocation(569,559);
        walls88.setLocation(634,552);
        walls106.setLocation(579,551);
        walls108.setLocation(477,550);
        walls108.setLocation(512,551);
        walls118.setLocation(471,546);
        boost3.setLocation(537,624);
        Walls walls119 = new Walls();
        addObject(walls119,468,608);
        Walls walls120 = new Walls();
        addObject(walls120,468,661);
        Walls walls121 = new Walls();
        addObject(walls121,333,546);
        walls108.setLocation(539,546);
        walls118.setLocation(453,557);
        walls108.setLocation(513,541);
        walls106.setLocation(336,494);
        walls108.setLocation(516,566);
        walls88.setLocation(565,563);
        Walls walls122 = new Walls();
        addObject(walls122,629,560);
        walls118.setLocation(476,561);
        walls108.setLocation(536,558);
        walls88.setLocation(570,564);
        walls108.setLocation(518,564);
        walls118.setLocation(463,556);
        walls88.setLocation(593,563);
        walls108.setLocation(540,566);
        removeObject(walls88);
        removeObject(walls108);
        walls118.setLocation(463,548);
        walls118.setLocation(473,547);
        removeObject(walls118);
        addObject(walls118,465,555);
        Walls walls123 = new Walls();
        addObject(walls123,519,553);
        Walls walls124 = new Walls();
        addObject(walls124,574,554);
        lloro lloro3 = new lloro(true);
        addObject(lloro3,399,619);
        boost.setLocation(357,85);
        lloro.setLocation(465,129);
        walls111.setLocation(248,70);
        walls111.setLocation(264,70);
        walls76.setLocation(344,187);
        walls77.setLocation(397,181);
        walls77.setLocation(415,209);
        walls78.setLocation(457,262);
        walls78.setLocation(456,258);
        removeObject(walls76);
        removeObject(walls77);
        removeObject(walls78);
        addObject(walls76,353,204);
        addObject(walls77,404,201);
        addObject(walls78,444,251);
        removeObject(lloro3);
        removeObject(walls76);
        removeObject(walls77);
        addObject(walls76,356,253);
        addObject(walls77,405,251);
        walls78.setLocation(463,265);
        removeObject(walls78);
        addObject(walls78,452,252);
        walls61.setLocation(172,639);
        walls63.setLocation(183,586);
        walls61.setLocation(180,646);
        walls63.setLocation(172,600);
        walls63.setLocation(182,599);
        walls87.setLocation(286,568);
        getBackground();
        walls87.setLocation(271,520);
        walls87.setLocation(266,521);
        removeObject(walls87);
        addObject(walls87,281,547);
    }
}