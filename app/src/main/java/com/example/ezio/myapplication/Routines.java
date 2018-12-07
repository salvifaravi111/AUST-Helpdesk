package com.example.ezio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Routines extends AppCompatActivity {

//CSE SAT//
    static String info1 = "(8:00am-10:30am)\nPhysics(Lab)\nRoom-5B04\n\n(10:30am-11:20am)\nElementary Structured Programming\nRoom-7A03\n\n(11:20am-1:00pm)\nPhysics\nRoom-7A03";
    static String info2 = "(8.00am-10.30am)\nIntroduction to Computer System(Lab)\nRoom-7B01\n\n(10.30am-11.20am)\nChemistry\nRoom-7A04\n\n(11.20am-12.10pm)\nElementary Structured Programming\nRoom-7A04\n\n(12.10pm-1.00pm)\nMathematics-1\nRoom-7A04";
    static String info3="(8:00am-10:30am)\nBasic Electrical Engineering (Lab) (A1)\nRoom-3B05\n\n(1:00pm-3:30pm)\nBasic Electrical Engineering (Lab) (A2)\nRoom-3B05";
    static String info4="(8:00am-10:30am)\nSoftware Development-I (Lab) (B1)\nRoom-7B06\n\n(1:00pm-3:30pm)\nObject Oriented Programming (Lab) (B2)\nRoom-7B05";
    static String info5="(10:30am-1:00pm)\nObject Oriented Programming (Lab) (C1)\nRoom-7B06\n\n(1:00am-3:30pm)\nSoftware Development-I (Lab) (C2)\nRoom-7B06";
    static String info6="(8:00am-9:40am)\nElectronic Devices & Circuits\nRoom-7C06\n\n(9:40am-10:30am)\nMathematics-III\nRoom-7C06\n\n(10:30am-1:00pm)\nDigital Logic Design (Lab) (A1)\nRoom-7B04\n\n(10:30am-1:00pm)\nData Structures (Lab) (A2)\nRoom-7B07";
    static String info7="(8:00am-9:40am)\nSociety, Ethics and Technology\nRoom-7C07\n\n(9:40am-10:30am)\nElectronic Devices & Circuits\nRoom-7C07\n\n(1:00pm-3:30pm)\nDigital Logic Design (Lab) (B1)\n\nRoom-7B04";
    static String info8="(10:30am-1:00pm)\nAlgorithms (Lab) (A2)\nRoom-7B08\n\n(1:00pm-2:40pm)\nDigital Electronics and Pulse Techniques\nRoom-7C06\n\n(2:40pm-3:30pm)\nMathematics- IV\nRoom-7C06";
    static String info9="(10:30am-1:00pm)\nNumerical Methods (Lab) (B1/B2)*\nRoom-7B01\n\n(1:00pm-1:50pm)\nMathematics- IV\nRoom-7C07\n\n(1:50pm-3:30pm)\nComputer Architecture\nRoom-7C07";
    static String info10="(8:00am-10:30am)\nSoftware Development-III (Lab) (C1/C2)*\nRoom-7B03\n\n(8:00am-10:30am)\nDigital Electronics and Pulse Techniques (Lab) (C2/C1)*\nRoom-7B04";
    static String info11="(8:00am-8:50am)\nEconomics and Accounting\nRoom-7A07\n\n(8:50am-10:30am)\nDatabase\nRoom-7A07\n\n(1:00pm-3:30pm)\nSoftware Development-IV (A1/A2)*\nRoom-7B07";
    static String info12="(8:00am-10:30am)\nSoftware Development-IV (B1/B2)*\nRoom-7B07\n\n(10:30am-11:20am)\nEconomics and Accounting\nRoom-7C06\n\n(11:20am-1:00am)\nDigital System Design\nRoom-7C06";
    static String info13= "(1:00pm-2:40pm)\nOperating System\nRoom-7A03\n\n(2:40pm-3:30pm)\nIndustrial Law and Safety Management\nRoom-3207";
    static String info14="(8:00am-9:40am)\nMicrocontroller Based System Design\nRoom-7A06\n\n(9:40am-10:30am)\nIndustrial Law and Safety Management\nRoom-7A06";
    static String info15="(1:00pm-2:40pm)\nInformation System Design and Software Enginnering\nRoom-7A04\n\n(2:40pm-3:30pm)\nOperating System\nRoom-7A04\n\n(3:30pm-4:20pm)\nIndustrial Law and Safety Management\nRoom-7A04";
    static String info16="(8:00am-8:50am)\nIndustrial Management\nRoom-7A03\n\n(8:50am-9:40am)\nArtificial Intelligence\nRoom-7A03\n\n(10:30am-1:00pm)\nDistributed Database Systems Lab (A1/A2)*\nRoom-7B03";
    static String info17="(8:00am-9:40am)\nFormal Languages & Compilers\nRoom-7A04\n\n(9:40am-10:30am)\nIndustrial Management\nRoom-7A04";
    static String info18="(10:30am-1:00pm)\nPattern Recognition Lab (A1/A2)*\nRoom-7B05\n\n(1:00pm-1:50pm)\nTelecommunication\nRoom-7A05\n\n(1:50pm-2:40pm)\nPattern Recognition\nRoom-7A05\n\n(2:40pm-3:30pm)\nDigital Image Processing\nRoom-7A05";
    static String info19="(11:20am-12:10pm)\nPattern Recognition\nRoom-7A06\n\n(12:10pm-1:00pm)\nTelecommunication\nRoom-7A06\n\n(1:00pm-1:50pm)\nPattern Recognition\nRoom-7A06\n\n(1:50pm-2:40pm)\nDigital Image Processing\nRoom-7A06";
    static String info20="(8:00am-10:30am)\nPattern Recognition Lab(C1/C2)*\nRoom-7B05\n\n(10:30am-11:20am)\nPattern Recognition\nRoom-7A07\n\n(11:20am-12:10pm)\nTelecommunication\nRoom-7A07\n\n(12:10pm-1:00pm)\nPattern Recognition\nRoom-7A07";
 //CSE SUN//
    static String info21="(8:00am-10:30am)\nEnglish Language(Lab)(A1)\nRoom-5A07\n\n(8:00am-10:30am)\nIntroduction to Computer Systems(Lab)(A2)\nRoom-7B01";
    static String info22="(10:30am-1:00pm)\nEnglish Language Sessional (B1)\nRoom-5A07\n\n(10:30am-1:00pm)\nElementary Structured Programming (Lab) (B2)\nRoom-7B01\n\n(1:00pm-1:50pm)\nPhysics\nRoom-7A04\n\n(1:50pm-3:30pm)\nCritical Thinking & Communication\nRoom-7A04";
    static String info23="(10:30am-11:20am)\nMathematics-II\nRoom-7A03\n\n(11:20am-1:00pm)\nDiscrete Mathematics\nRoom-7A03\n\n(1:00pm-3:30pm)\nSoftware Development-I (Lab) (A1)\nRoom-7B06";
    static String info24="(1:00pm-2:40pm)\nObject Oriented Programming\nRoom-7C06\n\n(2:40pm-3:30pm)\nBasic Mechanical Engineering\nRoom-7C06\n\n(3:30pm-6:00pm)\nSoftware Development-I (Lab) (B2)\nRoom-7B06";
    static String info25="(10:30am-1:00pm)\nEngineering Drawing (C1/C2)*\n\n(1:00pm-1:50pm)\nBasic Electrical Engineering\nRoom-7C07\n\n(1:50pm-3:30pm)\nMathematics-II\nRoom-7C07";
    static String info26="(8:00am-10:30am)\nElectronic Devices & Circuits (Lab) (A1)\nRoom-3B07\n\n(10:30am-11:20am)\nData Structures\nRoom-7A05\n\n(11:20am-1:00pm)\nDigital Logic Design\nRoom-7A05\n\n(1:00pm-1:50pm)\nSociety, Ethics and Technology\nRoom-7A05";
    static String info27="(8:00am-10:30am)\nData Structures (Lab) (B1)\nRoom-7B04\n\n(1:00pm-3:30pm)\nElectronic Devices & Circuits (Lab) (B2)\nRoom-3B07";
    static String info28="(10:30am-1:00pm)\nSoftware Development-III (Lab) (A1/A2)*\nRoom-7B07\n\n(1:00pm-1:50pm)\nMathematics- IV\nRoom-7A03\n\n(1:50pm-3:30pm)\nNumerical Methods\nRoom-7A03";
    static String info29="(8:00am-10:30am)\nSoftware Development-III (Lab)(B1/B2)*\nRoom-7B03\n\n(1:00pm-3:30pm)\nDigital Electronics and Pulse Techniques (Lab) (B2/B1)*\nRoom-7B04";
    static String info30="(10:30am-12:10pm)\nAlgorithms\nRoom-7C06\n\n(12:10pm-1:00pm)\nMathematics- IV\nRoom-7C06\n\n(1:00pm-3:30pm)\nAlgorithms (Lab) (C1)\nRoom-7B05";
    static String info31="(10:30am-11:20am)\nMicroprocessors\nRoom-7C07\n\n(11:20am-1:00pm)\nDigital System Design\nRoom-7C07\n\n(1:00pm-3:30pm)\nMicroprocessors Lab (A1/A2)*\nRoom-7B07";
    static String info32="(10:30am-12:10am)\nMathematical Analysis for Computer Science\nRoom-7A04\n\n(12:10am-1:00pm)\nMicroprocessors\nRoom-7A04\n\n(1:00pm-3:30pm)\nDatabase Lab (B1)\nRoom-7B03";
    static String info33="(8:00am-9:40am)\nInformation System Design and software Engineering\nRoom-7C06\n\n(9:40am-10:30am)\nData Communication\n7C06\n\n(1:pm-3:30pm)\nOperating System Lab\n7C06";
    static String info34="(8:50am-9:40am)\nData Communication\nRoom-7C07\n\n(9:40am-10:30am)\nInformation System Design and Software Engineering\nRoom-7C07\n\n(10:30am-1:00pm)\nOperating System Lab(B1)\nRoom-7B08";
    static String info35="(8:00am-8:50am)\nData Communication\nRoom-7A04\n\n(8:50am-10:30am)\nOperating System\nRoom-7A04\n\n(9:40am-10:30am)\nOperating System\nRoom-7A04\n\n(10:30am-1:00pm)\nSoftware Development-V (C1/C2)*\nRoom-7B03";
    static String info36="(10:30am-12:10pm)\nDistributed Database Systems\nRoom-7A07\n\n(12:10pm-1:00pm)\nFormal Languages & Compilers\nRoom-7A07\n\n(1:00pm-3:30pm)\nComputer Networks Lab  (A1)\nRoom-7B01";
    static String info37="(10:30am-11:20am)\nFormal Languages & Compilers\nRoom-7A06\n\n(11:20am-1:00pm)\nComputer Networks\nRoom-7A06";
    static String info38="(8:00am-8:50am)\nPattern Recognition\nRoom-7A05\n\n(8:50am-10:30am)\nComputer Graphics\nRoom-7A05";
    static String info39="(8:00am-8:50am)\nDigital Image Processing\nRoom-7A06\n\n(8:50pm-9:40pm)\nPattern Recognition\nRoom-7A06\n\n(9:40am-10:30am)\nNetwork Programming\nRoom-7A06\n\n(10:30am-1:00pm)\nPattern Recognition Lab(B1/B2)*\nRoom-7B05";
    static String info40="(8:00am-8:50am)\nNetwork Programming\nRoom-7A07\n\n(8:50am-9:40am)\nDigital Image Processing\nRoom-7A07\n\n(9:40am-10:30am)\nPattern Recognition\nRoom-7A07\n\n(10:30am-1:00pm)\nNetwork Programming Lab(C1/C2)*\nRoom-7B06";

 //CSE MON
    static String info41="(10:30am-11:20am)\nElementary Structured Programming\nRoom-7A03\n\n(11:20am-1:00pm)\nMathematics-I\nRoom-7A03\n\n(1:00pm-3:30pm)\nEnglish Language(Lab)(A2)\nRoom-5A07\n\n(1:00pm-3:30pm)\nIntroduction to Computer Systems(Lab)(A1)\nRoom-7B01";
    static String info42="(8:00am-10:30am)\nIntroduction to Computer Systems (Lab) (B2)\nRoom-7B01\n\n(10:30am-11:20am)\nCritical Thinking & Communication\nRoom-7A04\n\n(11:20am-12:10pm)\nElementary Structured Programming\nRoom-7A04\n\n(12:10pm-1:00pm)\nChemistry\nRoom-7A04";
    static String info43="(8:00am-9:40am)\nBasic Mechanical Engineering\nRoom-7C06\n\n(9:40am-10:30am)\nBasic Electrical Engineering\nRoom-7C06\n\n(10:30am-1:00pm)\nEngineering Drawing(Lab) (A1/A2)*";
    static String info44="(8:00am-10:30am)\nBasic Electrical Engineering (Lab) (B1)\nRoom-3B05\n\n(10:30am-11:20am)\nBasic Mechanical Engineering\nRoom-7A05\n\n(11:20am-1:00pm)\nDiscrete Mathematics\nRoom-7A05";
    static String info45="(8:00am-9:40am)\nObject Oriented Programming\nRoom-7C07\n\n(9:40am-10:30am)\nBasic Mechanical Engineering\nRoom-7C07";
    static String info46="(8:50am-9:40am)\nMathematics-III\nRoom-7A04\n\n(9:40am-10:30am)\nElectronic Devices & Circuits\nRoom-7A04\n\nDigital Logic Design (Lab) (A2)\nRoom-7B04";
    static String info47="(8:00am-9:40am)\nElectronic Devices & Circuits\nRoom-7A03\n\n(9:40am-10:30am)\nSociety, Ethics and Technology\nRoom-7A03\n\n(10:30am-1:00pm)\nElectronic Devices & Circuits (Lab) (B1)\nRoom-3B06";
    static String info48="(8:00am-8:50am)\nDigital Electronics and Pulse Techniques\nRoom-7A05\n\n(8:50am-10:30am)\nAlgorithms\nRoom-7A05\n\n(10:30am-1:00pm)\nAssembly Language Programming (A1)\nRoom-7B06";
    static String info49="(10:30am-12:10pm)\nDigital Electronics and Pulse Techniques\nRoom-7C07\n\n(12:10pm-1:00pm)\nMathematics- IV\nRoom-7C07\n\n(1:00pm-3:30pm)\nAssembly Language Programming (Lab) (B1)\nRoom-7B06";
    static String info50="(10:30am-1:00pm)\nNumerical Methods (Lab) (C1/C2)*\nRoom-7B08\n\n(1:00pm-1:50pm)\nMathematics- IV\nRoom-7A05\n\n(1:50pm-3:30pm)\nComputer Architecture\nRoom-7A05";
    static String info51="(8:00am-8:50am)\nDigital System Design\nRoom-7A07\n\n(8:50am-10:30am)\nMathematical Analysis for Computer Science\nRoom-7A07\n\n(10:30am-1:00pm)\nDatabase Lab(A1)\nRoom-7B05";
    static String info52="(1:00pm-3:30pm)\nMicroprocessors Lab (B1/B2)* \nRoom-7B07";
    static String info53="(8:00am-10:30am)\nMicrocontroller Based System Design Lab (A1/A2)*\nRoom-7B07";
    static String info54="(10:30am-1:00pm)\nMicrocontroller Based System Design Lab (B1/B2)*\nRoom-7B07";
    static String info55="(1:00pm-3:30pm)\nOperating System Lab (C1)\nRoom-7B08";
    static String info56="(1:00pm-1:50pm)\nIndustrial Management\nRoom-7A06\n\n(1:50pm-3:30pm)\nFormal Languages & Compilers\nRoom-7A06";
    static String info57="(8:00am-10:30am)\nFormal Languages & Compilers Lab(B1/B2)*\nRoom-7B08\n\n(10:30am-12:10pm)\nDistributed Database Systems\nRoom-7A07\n\n(12:10pm-1:00pm)\nIndustrial Management\nRoom-7A07";
    static String info58="(8:00am-10:30am)\nDigital Image Processing  Lab(A1/A2)*\nRoom-7B03\n\n(11:20am-1:00pm)\nTelecommunication\nRoom-7C06";
    static String info59="(11:20am-12:10pm)\nNetwork Programming\nRoom-7A06\n\n(12:10pm-1:00pm)\nTelecommunication\nRoom-7A06\n\n(1:00pm-3:30pm)\nNetwork Programming Lab(B1/B2)\nRoom-7B05";
    static String info60="(10:30am-1:00pm)\nDigital Image Processing  Lab(C1/C2)*\nRoom-7B03\n\n(1:00pm-1:50pm)\nTelecommunication\nRoom-7A07\n\n(1:50pm-3:30pm)\nComputer Graphics\nRoom-7A07";
    //CSE TUE
    static String info61="(10:30am-11:20am)\nCritical Thinking & Communication\nRoom-7A03\n\n(11:20am-1:00pm)\nChemistry\nRoom-7A03\n\n(1:00pm-3:30pm)\nElementary Structured Programming (Lab)(A1)\nRoom-7B01";
    static String info62="(8:00am-9:40am)\nPhysics\nRoom-7A04\n\n(9:40am-10:30am)\nChemistry\nRoom-7A04\n\n(10:30am-1:00pm)\nPhysics Lab (B1/B2)*\nRoom-5B04";
    static String info63="(10:30am-1:00pm)\nSoftware Development-I (Lab) (A2)\nRoom-7B06\n\n(1:00pm-1:50pm)\nObject Oriented Programming\nRoom-7C06\n\n(1:50pm-3:30pm)\nMathematics-II\nRoom-7C06";
    static String info64="(10:30am-1:00pm)\nObject Oriented Programming (Lab) (B1)\nRoom-7B05\n\n(1:00pm-1:50pm)\nBasic Mechanical Engineering\nRoom-7C07\n\n(1:50pm-3:30pm)\nBasic Electrical Engineering\nRoom-7C07";
    static String info65="(8:00am-10:30am)\nObject Oriented Programming (Lab) (C2)\nRoom-7B06\n\n(10:30-11:20am)\nMathematics-II\nRoom-7A06\n\n(11:20am-1:00pm)\nDiscrete Mathematics\nRoom-7A06";
    static String info66="(10:30am-11:20am)\nData Structures\nRoom-7C06\n\n(11:20am-1:00pm)\nSociety, Ethics and Technology\nRoom-7C06\n\n(1:00pm-1:50pm)\nMathematics-III\nRoom-7A04";
    static String info67="(10:30am-11:20am)\nMathematics-III\nRoom-7C07\n\n(11:20am-12:10pm)\nData Structures\nRoom-7C07\n\n(1:00pm-3:30pm)\nDigital Logic Design (Lab) (B2)\n\nRoom-7B04";
    static String info68="(10:30am-1:00pm)\nAlgorithms (Lab) (A1)\nRoom-7B01\n\n(1:00pm-1:50pm)\nNumerical Methods\nRoom-7A05\n\n(1:50pm-3:30pm)\nComputer Architecture\nRoom-7A05";
    static String info69="(10:30am-12:10pm)\nNumerical Methods\nRoom-7A05\n\n(12:10pm-1:00pm)\nDigital Electronics and Pulse Techniques\nRoom-7A05\n\n(1:00pm-3:30pm)\nAlgorithms (Lab) (B2)\nRoom-7B06";
    static String info70="(8:00am-10:30am)\nAssembly Language Programming (Lab) (C2)\nRoom-7B03\n\n(1:00pm-2:40pm)\nDigital Electronics and Pulse Techniques\nRoom-7A06\n\n(2:40pm-3:30pm)\nMathematics- IV\nRoom-7A06";
    static String info71="(8:50am-9:40am)\nMathematical Analysis for Computer Science\nRoom-7A05\n\n(9:40am-10:30am)\nDatabase\nRoom-7A05\n\n(10:30am-1:00pm)\nDatabase Lab (A2)\nRoom-7B03";
    static String info72="(10:30am-1:00pm)\nDatabase Lab (B2)\nRoom-7B03\n\n(1:00pm-1:50pm)\nDigital System Design\nRoom-7A07\n\n(1:50pm-3:30pm)\nMicroprocessors\nRoom-3107";
    static String info73="(8:00am-8:50am)\nData Communication\nRoom-7A06\n\n(10:30am-1:00pm)\nInformation System Design and software Engineering(A1/A2)*\nRoom-7B08";
    static String info74="(8:00am-8:50am)\nMicrocontroller Based System Design\nRoom-7A03\n\n(8:50am-9:40am)\nOperating System\nRoom-7A03\n\n(9:40am-10:30am)\nData Communication\nRoom-7A03\n\n(1:00pm-3:30pm)\nInformation System Design and Software Engineering Lab (B1/B2)*\nRoom-7B07";
    static String info75="(8:00am-8:50am)\nIndustrial Law and Safety Management\nRoom-7C06\n\n(8:50am-9:40am)\nData Communication\nRoom-7C06\n\n(9:40am-10:30am)\nMicrocontroller Based System Design\nRoom-7C06\n\n(10:30am-1:00pm)\nMicrocontroller Based System Design Lab (C1/C3)*\nRoom-7B07";
    static String info76="(10:30am-11:20am)\nIndustrial Management\nRoom-7A04\n\n(11:20am-1:00pm)\nComputer Networks\nRoom-7A04\n\n(1:00pm-3:30pm)\nComputer Networks Lab (A2)\nRoom-7B05";
    static String info77="(1:00pm-3:30pm)\nDistributed Database Systems Lab  (B1/B2)*\nRoom-7B03\n\n(1:00pm-3:30pm)\nArtificial Intelligence Lab (B1/B2)*\nRoom-7B08";
    static String info78="(11:20am-1:00pm)\nDigital Image Processing\nRoom-7A07\n\n(1:00pm-2:40pm)\nTelecommunication\nRoom-7A07";
    static String info79="(1:00pm-2:40pm)\nComputer Graphics\nRoom-7A03\n\n(2:40pm-3:30pm)\nNetwork Programming\nRoom-7A03";
    static String info80="(8:00am-10:30am)\nComputer Graphics Lab(C1/C2)*\nRoom-7B06";
//CSE WED
    static String info81="(8:00am-8:50am)\nPhysics\nRoom-7A03\n\n(8:50am-9:40am)\nElementary Structured Programming\nRoom-7A03\n\n(9:40am-10:30am)\nChemistry\nRoom-7A03\n\n(10:30am-1:00pm)\nIntroduction to Computer Systems(Lab)(A2)\nRoom-7B01";
    static String info82="(8:00am-8:50am)\nElementary Structured Programming\nRoom-7A04\n\n(8:50am-10:30am)\nMathematics-I\nRoom-7A04";
    static String info83="(10:30am-11:20am)\nDiscrete Mathematics\nRoom-7A03\n\n(11:20am-1:00pm)\nObject Oriented Programming\nRoom-7A03\n\n(1:00pm-3:30pm)\nObject Oriented Programming (Lab) (A1)\nRoom-7B01";
    static String info84="(10:30am-11:20am)\nMathematics-II\nRoom-7A04\n\n(11:20am-12:10pm)\nDiscrete Mathematics\nRoom-7A04\n\n(12:10pm-1:00pm)\nBasic Mechanical Engineering\nRoom-7A04\n\n(1:00pm-3:30pm)\nBasic Electrical Engineering (Lab) (B2)\nRoom-3B05";
    static String info85="(8:00am-10:30am)\nBasic Electrical Engineering (Lab) (C1)\nRoom-3B05\n\n(10:30am-12:10pm)\nBasic Electrical Engineering\nRoom-7A05\n\n(12:10pm-1:00pm)\nDiscrete Mathematics\nRoom-7A05";
    static String info86="(10:30am-1:00pm)\nData Structures (Lab) (A1)\nRoom-7B07\n\n(1:00pm-1:50pm)\nDigital Logic Design\nRoom-7C06\n\n(1:50pm-2:40pm)\nData Structures\nRoom-7C06\n\n(3:30pm-6:00pm)\nElectronic Devices & Circuits (Lab) (A1)\nRoom-3B06";
    static String info87="(8:00am-10:30am)\nSoftware Development-II (Lab) (B1/B2)*\nRoom-7B06\n\n(1:00pm-1:50pm)\nData Structures\nData Structures\nRoom-7C07\n\n(1:50pm-2:40pm)\nDigital Logic Design\nRoom-7C07\n\n(2:40pm-4:20pm)\nMathematics-III\nRoom-7C07";
    static String info88="(1:00pm-3:30pm)\nDigital Electronics and Pulse Techniques (Lab) (A1/A2)*\nRoom-7B04\n\n(1:00pm-3:30pm)\nNumerical Methods (Lab) (A1/A2)*\nRoom-7B05";
    static String info89="(8:00am-8:50am)\nMathematics- IV\nRoom-7C06\n\n(8:50am-10:30am)\nAlgorithms\nRoom-7C06\n\n(10:30am-1:00pm)\nAlgorithms (Lab) (B1)\nRoom-7B05";
    static String info90="(8:00am-10:30am)\nAssembly Language Programming (Lab) (C1)\nRoom-7B05\n\n(10:30am-12:10pm)\nNumerical Methods\nRoom-7C06\n\n(12:10pm-1:00pm)\nDigital Electronics and Pulse Techniques\nRoom-7C06";
    static String info91="(10:30am-1:00pm)\nDigital System Design Lab(A1/A2)*\nRoom-7B04";
    static String info92="(10:30am-1:00pm)\nDatabase Lab (B2)\nRoom-7B03\n\n(1:00pm-1:50pm)\nDigital System Design\nRoom-7A07\n\n(1:50pm-3:30pm)\nMicroprocessors\nRoom-3107";
    static String info93="(10:30am-12:10pm)\nMicrocontroller Based System Design\nRoom-7C07\n\n(12:10am-1:00am)Information System Design and software Engineering\nRoom-7C07\n\n(1:00pm-3:30pm)\nOperating System Lab (A2)\nRoom-7B08";
    static String info94="(10:30am-1:00pm)\nOperating System Lab(B2)\nRoom-7B08\n\n(1:00pm-1:50pm)\nIndustrial Law and Safety Management\nRoom-7A06\n\n(1:50pm-3:30pm)\nOperating System\nRoom-7A06";
    static String info95="(8:00am-10:30am)\nInformation System Design and Software Engineering Lab (C1/C2)*\nRoom-7B08\n\n(1:00pm-1:50pm)\nMicrocontroller Based System Design\nRoom-7A04\n\n(1:50pm-2:40pm)\nInformation System Design and Software Engineering\nRoom-7A04\n\n(2:40pm-3:30pm)\nIndustrial Law and Safety Management\nRoom-7A04";
    static String info96="(10:30am-11:20am)\nDistributed Database Systems\nRoom-7A07\n(11:20am-12:10pm)\nComputer Networks\nRoom-7A07\n\n(12:10pm-1:00pm)\nArtificial Intelligence\nRoom-7A07";
    static String info97="(8:00am-10:30am)\nComputer Networks Lab (B1)\nRoom-7B03\n\n(10:30am-11:20am)\nArtificial Intelligence \nRoom-7A06\n\n(11:20am-12:10pm)\nDistributed Database Systems\nRoom-7A06\n\n(12:10pm-1:00pm)\nComputer Networks\nRoom-7A06";
    static String info98="(10:30am-1:00pm)\nComputer Graphics Lab(A1/A2)*\nRoom-7B06";
    static String info99="(1:00pm-3:30pm)\nDigital Image Processing  Lab(B1/B2)*\nRoom-7B03\n\n(1:00pm-3:30pm)\nComputer Graphics Lab(B1/B2)*\nRoom-7B06";
    static String info100="(1:50pm-3:30pm)\nNetwork Programming\nRoom-7A03\n\n(3:30pm-4:20pm)\nDigital Image Processing\nRoom-7A03";
//CSE THU
    static String info101="(1:00pm-1:50pm)\nMathematics-I\nRoom-7A03\n\n(1:50pm-3:30pm)\nCritical Thinking & Communication\nRoom-7A03";
    static String info102="(1:00pm-3:30pm)\nEnglish Language Sessional (B2)\nRoom-5A07\n\n(1:00pm-3:30pm)\nElementary Structured Programming (Lab) (B1)\nRoom-7B01";
    static String info103="(8:00am-9:40am)\nBasic Electrical Engineering\nRoom-7A05\n\n(9:40am-10:30am)\nBasic Mechanical Engineering\nRoom-7A05\n\n(1:00pm-3:30pm)\nObject Oriented Programming (Lab) (A2)\nRoom-7B03";
    static String info104="(10:30am-11:20am)\nObject Oriented Programming\nRoom-7C07\n\n(11:20am-1:00pm)\nMathematics-II\nRoom-7C07\n\n(1:00pm-3:30pm)\nEngineering Drawing (B1/B2)*";
    static String info105="(8:00am-9:40am)\nBasic Mechanical Engineering\nRoom-7A04\n\n(9:40am-10:30am)\nObject Oriented Programming\nRoom-7A04\n\n(1:00am-3:30pm)\nBasic Electrical Engineering (Lab) (C2)\nRoom-3B05\n\n(1:00am-3:30pm)\nSoftware Development-I (Lab) (C1)\nRoom-7B06";
    static String info106="(10:30am-1:00pm)\nSoftware Development-II (Lab) (A1/A2)*\nRoom-7B06";
    static String info107="(8:00am-10:30am)\nData Structures (Lab) (B2)\nRoom-7B05\n\n(10:30am-11:20am)\nData Structures\nRoom-7A05\n\n(11:20am-1:00pm)\nDigital Logic Design\nRoom-7A05";
    static String info108="(8:00am-8:50am)\nMathematics- IV\nRoom-7A03\n\n(8:50am-9:40am)\nAlgorithms\nRoom-7A03\n\n(9:40am-10:30am)\nComputer Architecture\nRoom-7A03\n\n(10:30am-1:00pm)\nAssembly Language Programming (A2)\nRoom-7B07";
    static String info109="(8:00am-10:30am)\nAssembly Language Programming (Lab) (B2)\nRoom-7B06\n\n(10:30am-11:20am)\nNumerical Methods\nRoom-7A04\n\n(11:20am-12:10pm)\nAlgorithms\nRoom-7A04\n\n(12:10pm-1:00pm)\nComputer Architecture\nRoom-7A04";
    static String info110="(10:30am-11:20am)\nAlgorithms\nRoom-7A03\n\n(11:2am-12:10pm)\nComputer Architecture\nRoom-7A03\n\n(12:10pm-1:00pm)\nNumerical Methods\nRoom-7A03\n\n(1:00pm-3:30pm)\nAlgorithms (Lab) (C2)\nRoom-7B05";
    static String info111="(10:30am-12:10pm)\nMicroprocessors\nRoom-7A07\n\n(12:10pm-1:50pm)\nEconomics and Accounting\nRoom-7A07";
    static String info112="(8:00am-8:50am)\nEconomics and Accountings\n7A07\n\n(8:50am-10:30am)\nDatabase\nRoom-7A07\n\n(10:30am-1:00pm)\nDigital System Design Lab (B1/B2)* \nRoom-7B04";
    static String info113="(8:00am-8:50am)\nMicrocontroller Based System Design\nRoom-7C06\n\n(8:50am-9:40am)\nData Communicatio\nRoom-7C06\n\n(9:40am-10:30am)\nIndustrial Law and Safety Management\nRoom-7C06\n\n(10:30am-1:00pm)\nSoftware Development-IV(A1/A2)*\nRoom-7B03";
    static String info114="(8:00am-10:30am)\nSoftware Development-V (B1/B2)*\nRoom-7B03\n\n(10:30am-11:20am)\nData Communication\nRoom-7A06\n\n(11:20am-1:00pm)\nInformation System Design and Software Engineering\nRoom-7A06\n\n(1:00pm-1:50pm)\nIndustrial Law and Safety Management\nRoom-7A05";
    static String info115="(8:50am-9:40am)\nMicrocontroller Based System Design\nRoom-7C07\n\n(9:40am-10:30am)\nData Communication\nRoom-7C07\n\n(10:30am-1:00pm)\nOperating System Lab (C2)\n7B08";
    static String info116="(1:00pm-3:30pm)\nFormal Languages & Compilers Lab (A1/A2)*\nRoom-7B08\n\n(3:30pm-6:00pm)\nArtificial Intelligence Lab(A1/A2)*\nRoom-7B01";
    static String info117="(10:30am-1:00pm)\nComputer Networks Lab (B2)\nRoom-7B05\n\n(1:00pm-1:50pm)\nIndustrial Management\nRoom-7C06\n\n(1:50pm-3:30pm)\nArtificial Intelligence\nRoom-7C06";
    static String info118="(8:00am-10:30am)\nNetwork Programming Lab (A1/A2)*\nRoom-7B07\n\n(1:00pm-1:50pm)\nPattern Recognition\nRoom-7A06\n\n(1:50pm-2:40pm)\nComputer Graphics\nRoom-7A06\n\n(2:40pm-3:30pm)\nTelecommunication\nRoom-7A06";
    static String info119="(1:50pm-2:40pm)\nDigital Image Processing\nRoom-7A05\n\n(2:40pm-3:30pm)\nComputer Graphics\nRoom-7A05\n\n(3:30pm-4:20pm)\nTelecommunication\nRoom-7A05";
    static String info120="(1:50pm-2:40pm)\nTelecommunication\nRoom-7A07\n\n(2:40pm-3:30pm)\nDigital Image Processing\nRoom-7A07\n\n(3:30pm-4:20pm)\nComputer Graphics\nRoom-7A07";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routines);

        TextView t = (TextView) findViewById(R.id.txt);



        SecondActivity s = new SecondActivity();
        Spintest p = new Spintest();
        Switch sw=(Switch)findViewById(R.id.switch1);


        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            EditText ed=(EditText)findViewById(R.id.txte);
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                    ed.setEnabled(true);
                else
                    ed.setEnabled(false);


            }
        });





        if (s.x == 1 && p.y == 1 && p.z == 1 && p.p == 1)
            t.setText(info1);
        if (s.x == 1 && p.y == 1 && p.z == 1 && p.p == 2)
            t.setText(info2);
        if (s.x == 1 && p.y == 1 && p.z == 2 && p.p == 1)
            t.setText(info3);
        if (s.x == 1 && p.y == 1 && p.z == 2 && p.p == 2)
            t.setText(info4);
        if (s.x == 1 && p.y == 1 && p.z == 2 && p.p == 3)
         t.setText(info5);
        if (s.x == 1 && p.y == 1 && p.z == 3 && p.p == 1)
            t.setText(info6);
        if (s.x == 1 && p.y == 1 && p.z == 3 && p.p == 2)
            t.setText(info7);
        if (s.x == 1 && p.y == 1 && p.z == 4 && p.p == 1)
            t.setText(info8);
        if (s.x == 1 && p.y == 1 && p.z == 4 && p.p == 2)
            t.setText(info9);
        if (s.x == 1 && p.y == 1 && p.z == 4 && p.p == 3)
            t.setText(info10);
        if (s.x == 1 && p.y == 1 && p.z == 5 && p.p == 1)
            t.setText(info11);
        if (s.x == 1 && p.y == 1 && p.z == 5 && p.p == 2)
            t.setText(info12);
        if (s.x == 1 && p.y == 1 && p.z == 6 && p.p == 1)
            t.setText(info13);
        if (s.x == 1 && p.y == 1 && p.z == 6 && p.p == 2)
            t.setText(info14);
        if (s.x == 1 && p.y == 1 && p.z == 6 && p.p == 3)
            t.setText(info15);
        if (s.x == 1 && p.y == 1 && p.z == 7 && p.p == 1)
            t.setText(info16);
        if (s.x == 1 && p.y == 1 && p.z == 7 && p.p == 2)
            t.setText(info17);
        if (s.x == 1 && p.y == 1 && p.z == 8 && p.p == 1)
            t.setText(info18);
        if (s.x == 1 && p.y == 1 && p.z == 8 && p.p == 2)
            t.setText(info19);
        if (s.x == 1 && p.y == 1 && p.z == 8 && p.p == 3)
            t.setText(info20);

        if (s.x == 2 && p.y == 1 && p.z == 1 && p.p == 1)
            t.setText(info21);
        if (s.x == 2 && p.y == 1 && p.z == 1 && p.p == 2)
            t.setText(info22);
        if (s.x == 2 && p.y == 1 && p.z == 2 && p.p == 1)
            t.setText(info23);
        if (s.x == 2 && p.y == 1 && p.z == 2 && p.p == 2)
            t.setText(info24);
        if (s.x == 2 && p.y == 1 && p.z == 2 && p.p == 3)
            t.setText(info25);
        if (s.x == 2 && p.y == 1 && p.z == 3 && p.p == 1)
            t.setText(info26);
        if (s.x == 2 && p.y == 1 && p.z == 3 && p.p == 2)
            t.setText(info27);
        if (s.x == 2 && p.y == 1 && p.z == 4 && p.p == 1)
            t.setText(info28);
        if (s.x == 2 && p.y == 1 && p.z == 4 && p.p == 2)
            t.setText(info29);
        if (s.x == 2 && p.y == 1 && p.z == 4 && p.p == 3)
            t.setText(info30);
        if (s.x == 2 && p.y == 1 && p.z == 5 && p.p == 1)
            t.setText(info31);
        if (s.x == 2 && p.y == 1 && p.z == 5 && p.p == 2)
            t.setText(info32);
        if (s.x == 2 && p.y == 1 && p.z == 6 && p.p == 1)
            t.setText(info33);
        if (s.x == 2 && p.y == 1 && p.z == 6 && p.p == 2)
            t.setText(info34);
        if (s.x == 2 && p.y == 1 && p.z == 6 && p.p == 3)
            t.setText(info35);
        if (s.x == 2 && p.y == 1 && p.z == 7 && p.p == 1)
            t.setText(info36);
        if (s.x == 2 && p.y == 1 && p.z == 7 && p.p == 2)
            t.setText(info37);
        if (s.x == 2 && p.y == 1 && p.z == 8 && p.p == 1)
            t.setText(info38);
        if (s.x == 2 && p.y == 1 && p.z == 8 && p.p == 2)
            t.setText(info39);
        if (s.x == 2 && p.y == 1 && p.z == 8 && p.p == 3)
            t.setText(info40);

        if (s.x == 3 && p.y == 1 && p.z == 1 && p.p == 1)
            t.setText(info41);
        if (s.x == 3 && p.y == 1 && p.z == 1 && p.p == 2)
            t.setText(info42);
        if (s.x == 3 && p.y == 1 && p.z == 2 && p.p == 1)
            t.setText(info43);
        if (s.x == 3 && p.y == 1 && p.z == 2 && p.p == 2)
            t.setText(info44);
        if (s.x == 3 && p.y == 1 && p.z == 2 && p.p == 3)
            t.setText(info45);
        if (s.x == 3 && p.y == 1 && p.z == 3 && p.p == 1)
            t.setText(info46);
        if (s.x == 3 && p.y == 1 && p.z == 3 && p.p == 2)
            t.setText(info47);
        if (s.x == 3 && p.y == 1 && p.z == 4 && p.p == 1)
            t.setText(info48);
        if (s.x == 3 && p.y == 1 && p.z == 4 && p.p == 2)
            t.setText(info49);
        if (s.x == 3 && p.y == 1 && p.z == 4 && p.p == 3)
            t.setText(info50);
        if (s.x == 3 && p.y == 1 && p.z == 5 && p.p == 1)
            t.setText(info51);
        if (s.x == 3 && p.y == 1 && p.z == 5 && p.p == 2)
            t.setText(info52);
        if (s.x == 3 && p.y == 1 && p.z == 6 && p.p == 1)
            t.setText(info53);
        if (s.x == 3 && p.y == 1 && p.z == 6 && p.p == 2)
            t.setText(info54);
        if (s.x == 3 && p.y == 1 && p.z == 6 && p.p == 3)
            t.setText(info55);
        if (s.x == 3 && p.y == 1 && p.z == 7 && p.p == 1)
            t.setText(info56);
        if (s.x == 3 && p.y == 1 && p.z == 7 && p.p == 2)
            t.setText(info57);
        if (s.x == 3 && p.y == 1 && p.z == 8 && p.p == 1)
            t.setText(info58);
        if (s.x == 3 && p.y == 1 && p.z == 8 && p.p == 2)
            t.setText(info59);
        if (s.x == 3 && p.y == 1 && p.z == 8 && p.p == 3)
            t.setText(info60);

        if (s.x == 4 && p.y == 1 && p.z == 1 && p.p == 1)
            t.setText(info61);
        if (s.x == 4 && p.y == 1 && p.z == 1 && p.p == 2)
            t.setText(info62);
        if (s.x == 4 && p.y == 1 && p.z == 2 && p.p == 1)
            t.setText(info63);
        if (s.x == 4 && p.y == 1 && p.z == 2 && p.p == 2)
            t.setText(info64);
        if (s.x == 4 && p.y == 1 && p.z == 2 && p.p == 3)
            t.setText(info65);
        if (s.x == 4 && p.y == 1 && p.z == 3 && p.p == 1)
            t.setText(info66);
        if (s.x == 4 && p.y == 1 && p.z == 3 && p.p == 2)
            t.setText(info67);
        if (s.x == 4 && p.y == 1 && p.z == 4 && p.p == 1)
            t.setText(info68);
        if (s.x == 4 && p.y == 1 && p.z == 4 && p.p == 2)
            t.setText(info69);
        if (s.x == 4 && p.y == 1 && p.z == 4 && p.p == 3)
            t.setText(info70);
        if (s.x == 4 && p.y == 1 && p.z == 5 && p.p == 1)
            t.setText(info71);
        if (s.x == 4 && p.y == 1 && p.z == 5 && p.p == 2)
            t.setText(info72);
        if (s.x == 4 && p.y == 1 && p.z == 6 && p.p == 1)
            t.setText(info73);
        if (s.x == 4 && p.y == 1 && p.z == 6 && p.p == 2)
            t.setText(info74);
        if (s.x == 4 && p.y == 1 && p.z == 6 && p.p == 3)
            t.setText(info75);
        if (s.x == 4 && p.y == 1 && p.z == 7 && p.p == 1)
            t.setText(info76);
        if (s.x == 4 && p.y == 1 && p.z == 7 && p.p == 2)
            t.setText(info77);
        if (s.x == 4 && p.y == 1 && p.z == 8 && p.p == 1)
            t.setText(info78);
        if (s.x == 4 && p.y == 1 && p.z == 8 && p.p == 2)
            t.setText(info79);
        if (s.x == 4 && p.y == 1 && p.z == 8 && p.p == 3)
            t.setText(info80);

        if (s.x == 5 && p.y == 1 && p.z == 1 && p.p == 1)
            t.setText(info81);
        if (s.x == 5 && p.y == 1 && p.z == 1 && p.p == 2)
            t.setText(info82);
        if (s.x == 5 && p.y == 1 && p.z == 2 && p.p == 1)
            t.setText(info83);
        if (s.x == 5 && p.y == 1 && p.z == 2 && p.p == 2)
            t.setText(info84);
        if (s.x == 5 && p.y == 1 && p.z == 2 && p.p == 3)
            t.setText(info85);
        if (s.x == 5 && p.y == 1 && p.z == 3 && p.p == 1)
            t.setText(info86);
        if (s.x == 5 && p.y == 1 && p.z == 3 && p.p == 2)
            t.setText(info87);
        if (s.x == 5 && p.y == 1 && p.z == 4 && p.p == 1)
            t.setText(info88);
        if (s.x == 5 && p.y == 1 && p.z == 4 && p.p == 2)
            t.setText(info89);
        if (s.x == 5 && p.y == 1 && p.z == 4 && p.p == 3)
            t.setText(info90);
        if (s.x == 5 && p.y == 1 && p.z == 5 && p.p == 1)
            t.setText(info91);
        if (s.x == 5 && p.y == 1 && p.z == 5 && p.p == 2)
            t.setText(info92);
        if (s.x == 5 && p.y == 1 && p.z == 6 && p.p == 1)
            t.setText(info93);
        if (s.x == 5 && p.y == 1 && p.z == 6 && p.p == 2)
            t.setText(info94);
        if (s.x == 5 && p.y == 1 && p.z == 6 && p.p == 3)
            t.setText(info95);
        if (s.x == 5 && p.y == 1 && p.z == 7 && p.p == 1)
            t.setText(info96);
        if (s.x == 5 && p.y == 1 && p.z == 7 && p.p == 2)
            t.setText(info97);
        if (s.x == 5 && p.y == 1 && p.z == 8 && p.p == 1)
            t.setText(info98);
        if (s.x == 5 && p.y == 1 && p.z == 8 && p.p == 2)
            t.setText(info99);
        if (s.x == 5 && p.y == 1 && p.z == 8 && p.p == 3)
            t.setText(info100);

        if (s.x == 6 && p.y == 1 && p.z == 1 && p.p == 1)
            t.setText(info101);
        if (s.x == 6 && p.y == 1 && p.z == 1 && p.p == 2)
            t.setText(info102);
        if (s.x == 6 && p.y == 1 && p.z == 2 && p.p == 1)
            t.setText(info103);
        if (s.x == 6 && p.y == 1 && p.z == 2 && p.p == 2)
            t.setText(info104);
        if (s.x == 6 && p.y == 1 && p.z == 2 && p.p == 3)
            t.setText(info105);
        if (s.x == 6 && p.y == 1 && p.z == 3 && p.p == 1)
            t.setText(info106);
        if (s.x == 6 && p.y == 1 && p.z == 3 && p.p == 2)
            t.setText(info107);
        if (s.x == 6 && p.y == 1 && p.z == 4 && p.p == 1)
            t.setText(info108);
        if (s.x == 6 && p.y == 1 && p.z == 4 && p.p == 2)
            t.setText(info109);
        if (s.x == 6 && p.y == 1 && p.z == 4 && p.p == 3)
            t.setText(info110);
        if (s.x == 6 && p.y == 1 && p.z == 5 && p.p == 1)
            t.setText(info111);
        if (s.x == 6 && p.y == 1 && p.z == 5 && p.p == 2)
            t.setText(info112);
        if (s.x == 6 && p.y == 1 && p.z == 6 && p.p == 1)
            t.setText(info113);
        if (s.x == 6 && p.y == 1 && p.z == 6 && p.p == 2)
            t.setText(info114);
        if (s.x == 6 && p.y == 1 && p.z == 6 && p.p == 3)
            t.setText(info115);
        if (s.x == 6 && p.y == 1 && p.z == 7 && p.p == 1)
            t.setText(info116);
        if (s.x == 6 && p.y == 1 && p.z == 7 && p.p == 2)
            t.setText(info117);
        if (s.x == 6 && p.y == 1 && p.z == 8 && p.p == 1)
            t.setText(info118);
        if (s.x == 6 && p.y == 1 && p.z == 8 && p.p == 2)
            t.setText(info119);
        if (s.x == 6 && p.y == 1 && p.z == 8 && p.p == 3)
            t.setText(info120);






    }

    public void edit(View v) {

        EditText et = (EditText) findViewById(R.id.txte);

        TextView t = (TextView) findViewById(R.id.txt);


        et.setText(t.getText());

        t.setText("");


    }

    public void save(View v) {

        SecondActivity s = new SecondActivity();
        Spintest p = new Spintest();
        EditText et = (EditText) findViewById(R.id.txte);

        TextView t = (TextView) findViewById(R.id.txt);

        t.setText(et.getText());
            if (s.x == 1 && p.y == 1 && p.z == 1 && p.p == 2)
            info2 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 1 && p.p == 1)
            info1 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 2 && p.p == 1)
                info3 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 2 && p.p == 2)
                info4 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 2 && p.p == 3)
                info5 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 3 && p.p == 1)
                info6 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 3 && p.p == 2)
                info7 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 4 && p.p == 1)
                info8 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 4 && p.p == 2)
                info9 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 4 && p.p == 3)
                info10 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 5 && p.p == 1)
                info11 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 5 && p.p == 2)
                info12 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 6 && p.p == 1)
                info13 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 6 && p.p == 2)
                info14 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 6 && p.p == 3)
                info15 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 7 && p.p == 1)
                info16 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 7 && p.p == 2)
                info17 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 8 && p.p == 1)
                info18 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 8 && p.p == 2)
                info19 = et.getText().toString();
            if (s.x == 1 && p.y == 1 && p.z == 8 && p.p == 3)
                info20 = et.getText().toString();

                    if (s.x == 2 && p.y == 1 && p.z == 1 && p.p == 2)
                    info22 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 1 && p.p == 1)
                    info21 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 2 && p.p == 1)
                        info23 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 2 && p.p == 2)
                        info24 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 2 && p.p == 3)
                        info25 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 3 && p.p == 1)
                        info26 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 3 && p.p == 2)
                        info27 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 4 && p.p == 1)
                        info28 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 4 && p.p == 2)
                        info29 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 4 && p.p == 3)
                        info30 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 5 && p.p == 1)
                        info31 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 5 && p.p == 2)
                        info32 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 6 && p.p == 1)
                        info33 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 6 && p.p == 2)
                        info34 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 6 && p.p == 3)
                        info35 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 7 && p.p == 1)
                        info36 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 7 && p.p == 2)
                        info37 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 8 && p.p == 1)
                        info38 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 8 && p.p == 2)
                        info39 = et.getText().toString();
                    if (s.x == 2 && p.y == 1 && p.z == 8 && p.p == 3)
                        info40 = et.getText().toString();

        if (s.x == 3 && p.y == 1 && p.z == 1 && p.p == 2)
            info42 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 1 && p.p == 1)
            info41 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 2 && p.p == 1)
            info43 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 2 && p.p == 2)
            info44 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 2 && p.p == 3)
            info45 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 3 && p.p == 1)
            info46 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 3 && p.p == 2)
            info47 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 4 && p.p == 1)
            info48 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 4 && p.p == 2)
            info49 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 4 && p.p == 3)
            info50 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 5 && p.p == 1)
            info51 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 5 && p.p == 2)
            info52 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 6 && p.p == 1)
            info53 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 6 && p.p == 2)
            info54 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 6 && p.p == 3)
            info55 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 7 && p.p == 1)
            info56 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 7 && p.p == 2)
            info57 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 8 && p.p == 1)
            info58 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 8 && p.p == 2)
            info59 = et.getText().toString();
        if (s.x == 3 && p.y == 1 && p.z == 8 && p.p == 3)
            info60 = et.getText().toString();

        if (s.x == 4 && p.y == 1 && p.z == 1 && p.p == 2)
            info62 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 1 && p.p == 1)
            info61 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 2 && p.p == 1)
            info63 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 2 && p.p == 2)
            info64 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 2 && p.p == 3)
            info65 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 3 && p.p == 1)
            info66 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 3 && p.p == 2)
            info67 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 4 && p.p == 1)
            info68 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 4 && p.p == 2)
            info69 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 4 && p.p == 3)
            info70 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 5 && p.p == 1)
            info71 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 5 && p.p == 2)
            info72 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 6 && p.p == 1)
            info73 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 6 && p.p == 2)
            info74 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 6 && p.p == 3)
            info75 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 7 && p.p == 1)
            info76 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 7 && p.p == 2)
            info77 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 8 && p.p == 1)
            info78 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 8 && p.p == 2)
            info79 = et.getText().toString();
        if (s.x == 4 && p.y == 1 && p.z == 8 && p.p == 3)
            info80 = et.getText().toString();

        if (s.x == 5 && p.y == 1 && p.z == 1 && p.p == 2)
            info82 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 1 && p.p == 1)
            info81 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 2 && p.p == 1)
            info83 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 2 && p.p == 2)
            info84 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 2 && p.p == 3)
            info85 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 3 && p.p == 1)
            info86 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 3 && p.p == 2)
            info87 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 4 && p.p == 1)
            info88 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 4 && p.p == 2)
            info89 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 4 && p.p == 3)
            info90 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 5 && p.p == 1)
            info91 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 5 && p.p == 2)
            info92 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 6 && p.p == 1)
            info93 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 6 && p.p == 2)
            info94 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 6 && p.p == 3)
            info95 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 7 && p.p == 1)
            info96 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 7 && p.p == 2)
            info97 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 8 && p.p == 1)
            info98 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 8 && p.p == 2)
            info99 = et.getText().toString();
        if (s.x == 5 && p.y == 1 && p.z == 8 && p.p == 3)
            info100 = et.getText().toString();

        if (s.x == 6 && p.y == 1 && p.z == 1 && p.p == 2)
            info102 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 1 && p.p == 1)
            info101 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 2 && p.p == 1)
            info103 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 2 && p.p == 2)
            info104 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 2 && p.p == 3)
            info105 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 3 && p.p == 1)
            info106 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 3 && p.p == 2)
            info107 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 4 && p.p == 1)
            info108 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 4 && p.p == 2)
            info109 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 4 && p.p == 3)
            info110 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 5 && p.p == 1)
            info111 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 5 && p.p == 2)
            info112 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 6 && p.p == 1)
            info113 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 6 && p.p == 2)
            info114 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 6 && p.p == 3)
            info115 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 7 && p.p == 1)
            info116 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 7 && p.p == 2)
            info117 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 8 && p.p == 1)
            info118 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 8 && p.p == 2)
            info119 = et.getText().toString();
        if (s.x == 6 && p.y == 1 && p.z == 8 && p.p == 3)
            info120 = et.getText().toString();



        et.setText("");


    }
}
