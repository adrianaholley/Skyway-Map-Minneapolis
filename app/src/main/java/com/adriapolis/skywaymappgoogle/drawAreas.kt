package com.adriapolis.skywaymappgoogle

import android.graphics.Color
import com.google.android.gms.maps.model.JointType
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.gms.maps.model.RoundCap

class drawAreas {

    fun drawArea00(): PolylineOptions {
        return PolylineOptions() // BLUE
            .color(Color.parseColor("#5050ea")) //365
            .add(LatLng(44.979980,-93.269446))
            .add(LatLng(44.979919,-93.269489))
            .add(LatLng(44.979915,-93.269520))
            .add(LatLng(44.979890,-93.269588))
            .add(LatLng(44.979795,-93.269321))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea0400(): PolylineOptions {
        return PolylineOptions() // BLUE
            .color(Color.parseColor("#5050ea")) //ECMC
            .add(LatLng(44.9802639, -93.2661902))
            .add(LatLng(44.9803771, -93.2664452))
            .add(LatLng(44.9804437, -93.2665313))
            .add(LatLng(44.98054, -93.266713)) //MAYBE UNNECESSARY points somewhere
            .add(LatLng(44.980629, -93.266937))
            .add(LatLng(44.980851, -93.267482))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0403(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //ECMC
            .add(LatLng(44.9803537, -93.2661101))
            .add(LatLng(44.9802722, -93.2659245))
            .add(LatLng(44.98, -93.26548))
            .add(LatLng(44.979462, -93.265289))
            .add(LatLng(44.979321, -93.264938))
            .add(LatLng(44.979622, -93.264687))
            .add(LatLng(44.978889, -93.262962))
            .add(LatLng(44.978588, -93.263199))
            .add(LatLng(44.978451, -93.263161))
            .add(LatLng(44.978298, -93.262833))
            .add(LatLng(44.9780096, -93.2630337))
            .add(LatLng(44.9782053, -93.2634931))
            .add(LatLng(44.97784, -93.263802))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0500(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //MEGABUS STOP
            .add(LatLng(44.980251, -93.276413))
            .add(LatLng(44.98061, -93.276001))
            .add(LatLng(44.98101, -93.275421))
            .add(LatLng(44.980618, -93.274879))
            .add(LatLng(44.9808016, -93.2746316))
            .add(LatLng(44.9811991, -93.2752237))
            .add(LatLng(44.98259, -93.273201))
            .add(LatLng(44.983391, -93.27433))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0502(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //advocates for human rights
            .add(LatLng(44.9791134, -93.2670085))
            .add(LatLng(44.9790414, -93.2670855))
            .add(LatLng(44.9790254, -93.2672685))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0504(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //US DISTRICT COURT
            .add(LatLng(44.977245, -93.263442))
            .add(LatLng(44.977474, -93.264006))
            .add(LatLng(44.977541, -93.264042))
            .add(LatLng(44.977885, -93.26488))
            .add(LatLng(44.978053, -93.265289))
            .add(LatLng(44.978171, -93.265304))
            .add(LatLng(44.9784642, -93.2650401))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0506(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //IGRILL
            .add(LatLng(44.978623, -93.2666874))
            .add(LatLng(44.978671, -93.266505))
            .add(LatLng(44.978509, -93.266113))
            .add(LatLng(44.9786217, -93.2658407))
            .add(LatLng(44.978611, -93.265799))
            .add(LatLng(44.97854, -93.265648))
            .add(LatLng(44.978663, -93.265542))
            .add(LatLng(44.9781245, -93.2641532))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0507(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //jerry haaf
            .add(LatLng(44.9780096, -93.2630337))
            .add(LatLng(44.9778054, -93.2631984))
            .add(LatLng(44.9775984, -93.2631191))
            .add(LatLng(44.977245, -93.263442))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0508(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //JERRY HAAF
            .add(LatLng(44.9775984, -93.2631191))
            .add(LatLng(44.9773048, -93.2628455))
            .add(LatLng(44.9771037, -93.2625559))
            .add(LatLng(44.9764035, -93.2608071))
            .add(LatLng(44.9763542, -93.260842))
            .add(LatLng(44.9761066, -93.2602103))
            .add(LatLng(44.9759805, -93.2598469))
            .add(LatLng(44.9755687, -93.2588357))
            .add(LatLng(44.9756484, -93.2587659))
            .add(LatLng(44.9754169, -93.2582563))
            .add(LatLng(44.9750184, -93.2579398))
            .add(LatLng(44.9746446, -93.2572022))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0601(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //AC Hotel
            .add(LatLng(44.979729, -93.271332))
            .add(LatLng(44.9797039, -93.2712798))
            .add(LatLng(44.980054, -93.2710049))
            .add(LatLng(44.9801508, -93.271245))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0602(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //fifth street towers
            .add(LatLng(44.9784521, -93.2688142))
            .add(LatLng(44.9786969, -93.268602))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0603(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //fifth street towers
            .add(LatLng(44.9781154, -93.267834))
            .add(LatLng(44.978253, -93.267639))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0604(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //XCEL
            .add(LatLng(44.9795097, -93.2702935))
            .add(LatLng(44.9793221, -93.2699078))
            .add(LatLng(44.979161, -93.269498))
            .add(LatLng(44.978843, -93.26976))
            .add(LatLng(44.978449, -93.268815))
            .add(LatLng(44.978307, -93.268928))
            .add(LatLng(44.9782198, -93.2687397))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0606(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //EMERY
            .add(LatLng(44.977982, -93.267403))
            .add(LatLng(44.978375, -93.267045))
            .add(LatLng(44.9783812, -93.2669461))
            .add(LatLng(44.978401, -93.266853))
            .add(LatLng(44.978623, -93.2666874))
            .add(LatLng(44.978809, -93.266754))
            .add(LatLng(44.979116, -93.26701))
            .add(LatLng(44.979432, -93.266748))
            .add(LatLng(44.9796083, -93.2667788))
            .add(LatLng(44.9798839, -93.2665121))
            .add(LatLng(44.981892, -93.264801))
            .add(LatLng(44.981972, -93.264961))
            .add(LatLng(44.982349, -93.264679))
            .add(LatLng(44.982426, -93.264854))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0700(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //ramp B
            .add(LatLng(44.981007, -93.275421))
            .add(LatLng(44.981583, -93.27623))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0701(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //OCEANAIRE
            .add(LatLng(44.978363, -93.27184))
            .add(LatLng(44.978231, -93.271534))
            .add(LatLng(44.978395, -93.271395))
            .add(LatLng(44.978149, -93.27073))
            .add(LatLng(44.977921, -93.270913))
            .add(LatLng(44.977904, -93.270875))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0702(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //oceanaire
            .add(LatLng(44.9788548, -93.2723948))
            .add(LatLng(44.9790589, -93.2728722))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0703(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //508
            .add(LatLng(44.980721, -93.275009))
            .add(LatLng(44.980614, -93.275162))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0704(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //RBC Plaza
            .add(LatLng(44.9779783, -93.2702653))
            .add(LatLng(44.9783833, -93.2699153))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0705(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //oceanaire
            .add(LatLng(44.9783639, -93.2713071))
            .add(LatLng(44.978596, -93.271126))
            .add(LatLng(44.978642, -93.27124))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0707(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //OCEANAIRE
            .add(LatLng(44.978857, -93.272135))
            .add(LatLng(44.979469, -93.271667))
            .add(LatLng(44.97963, -93.272072))
            .add(LatLng(44.979912, -93.271751))
            .add(LatLng(44.979729, -93.271332))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0708(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //RBC Plaza
            .add(LatLng(44.9782576, -93.270567))
            .add(LatLng(44.9784486, -93.270407))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0709(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //RBC PLAZA
            .add(LatLng(44.9778065, -93.2699))
            .add(LatLng(44.97765, -93.269514))
            .add(LatLng(44.977571, -93.269569))
            .add(LatLng(44.977492, -93.269523))
            .add(LatLng(44.9774054, -93.2692861))
            .add(LatLng(44.9773008, -93.2693661))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0710(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //US Bank Plaza
            .add(LatLng(44.976845, -93.267559))
            .add(LatLng(44.976779, -93.267893))
            .add(LatLng(44.97699, -93.267966))
            .add(LatLng(44.977048, -93.267919))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0711(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //RBC Plaza
            .add(LatLng(44.978149, -93.27073))
            .add(LatLng(44.978256, -93.270644))
            .add(LatLng(44.978256, -93.27057))
            .add(LatLng(44.978217, -93.270495))
            .add(LatLng(44.978118, -93.270575))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0712(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //SOO LINE
            .add(LatLng(44.977307, -93.268606))
            .add(LatLng(44.9773332, -93.2686928))
            .add(LatLng(44.977358, -93.268794))
            .add(LatLng(44.977363, -93.268872))
            .add(LatLng(44.977362, -93.268965))
            .add(LatLng(44.977343, -93.269053))
            .add(LatLng(44.977317, -93.269115))
            .add(LatLng(44.9772868, -93.2691742))
            .add(LatLng(44.977248, -93.269228))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0713(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //PEOPLE'S PLAZA
            .add(LatLng(44.975938, -93.266589))
            .add(LatLng(44.976241, -93.266325))
            .add(LatLng(44.976215, -93.266238))
            .add(LatLng(44.976206, -93.266152))
            .add(LatLng(44.976212, -93.266072))
            .add(LatLng(44.976235, -93.265985))
            .add(LatLng(44.976268, -93.265919))
            .add(LatLng(44.976308, -93.265869))
            .add(LatLng(44.976355, -93.265832))
            .add(LatLng(44.976427, -93.265808))
            .add(LatLng(44.976489, -93.265811))
            .add(LatLng(44.97654, -93.265832))
            .add(LatLng(44.97658, -93.265861))
            .add(LatLng(44.976616, -93.265901))
            .add(LatLng(44.976643, -93.265944))
            .add(LatLng(44.977885, -93.26488))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0714(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //SOO LINE
            .add(LatLng(44.9774054, -93.2692861))
            .add(LatLng(44.977636, -93.269076))
            .add(LatLng(44.977633, -93.268941))
            .add(LatLng(44.977723, -93.268866))
            .add(LatLng(44.9779204, -93.2689664))
            .add(LatLng(44.9782198, -93.2687397))
            .add(LatLng(44.978195, -93.268659))
            .add(LatLng(44.9782051, -93.2685508))
            .add(LatLng(44.978287, -93.268446))
            .add(LatLng(44.978122, -93.268011))
            .add(LatLng(44.9781812, -93.2679632))
            .add(LatLng(44.978074, -93.2677441))
            .add(LatLng(44.977982, -93.267403))
            .add(LatLng(44.977741, -93.267593))
            .add(LatLng(44.977631, -93.267311))
            .add(LatLng(44.977181, -93.267725))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0715(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //PEOPLE'S PLAZA
            .add(LatLng(44.976643, -93.265944))
            .add(LatLng(44.9766606, -93.2659905))
            .add(LatLng(44.976673, -93.266022))
            .add(LatLng(44.976683, -93.266066))
            .add(LatLng(44.97669, -93.266129))
            .add(LatLng(44.976688, -93.266198))
            .add(LatLng(44.976671, -93.266282))
            .add(LatLng(44.976644, -93.266347))
            .add(LatLng(44.976615, -93.266395))
            .add(LatLng(44.976568, -93.266444))
            .add(LatLng(44.976511, -93.266477))
            .add(LatLng(44.976467, -93.266488))
            .add(LatLng(44.976413, -93.266485))
            .add(LatLng(44.976354, -93.266462))
            .add(LatLng(44.976311, -93.266428))
            .add(LatLng(44.976268, -93.266375))
            .add(LatLng(44.976241, -93.266325))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0716(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //GOV CENTER RAMP
            .add(LatLng(44.975427, -93.265188))
            .add(LatLng(44.9761103, -93.2645743))
            .add(LatLng(44.9765867, -93.264179))
            .add(LatLng(44.977064, -93.263782))
            .add(LatLng(44.977102, -93.263745))
            .add(LatLng(44.977103, -93.263717))
            .add(LatLng(44.9770508, -93.2635961))
            .add(LatLng(44.977244, -93.263439))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0800(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //RAMP A
            .add(LatLng(44.9762569, -93.2755414))
            .add(LatLng(44.9765899, -93.2763038))
            .add(LatLng(44.976959, -93.275887))
            .add(LatLng(44.977169, -93.276299))
            .add(LatLng(44.977482, -93.276611))
            .add(LatLng(44.978035, -93.277527))
            .add(LatLng(44.979561, -93.277519))
            .add(LatLng(44.980251, -93.276413))
            .add(LatLng(44.980031, -93.276109))
            .add(LatLng(44.980023, -93.275768))
            .add(LatLng(44.97975, -93.275389))
            .add(LatLng(44.97953, -93.275389))
            .add(LatLng(44.9794763, -93.2753106))
            .add(LatLng(44.979077, -93.274733))
            .add(LatLng(44.9787998, -93.2746395))
            .add(LatLng(44.978345, -93.273998))
            .add(LatLng(44.978055, -93.273463))
            .add(LatLng(44.978081, -93.27325))
            .add(LatLng(44.9781872, -93.273177))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0801(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //city center
            .add(LatLng(44.9782384, -93.2732935))
            .add(LatLng(44.977903, -93.272555))
            .add(LatLng(44.977824, -93.27262))
            .add(LatLng(44.977712, -93.272351))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0802(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //city center
            .add(LatLng(44.978002, -93.273063))
            .add(LatLng(44.977429, -93.273065))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0803(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //city center
            .add(LatLng(44.978569, -93.272652))
            .add(LatLng(44.97868, -93.272919))
            .add(LatLng(44.9782384, -93.2732935))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0804(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //city center
            .add(LatLng(44.977429, -93.273065))
            .add(LatLng(44.977253, -93.272659))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0805(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //City Center
            .add(LatLng(44.978081, -93.27325))
            .add(LatLng(44.977824, -93.27262))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0806(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //JUUL
            .add(LatLng(44.976752, -93.270073))
            .add(LatLng(44.9769863, -93.2705369))
            .add(LatLng(44.97727, -93.271202))
            .add(LatLng(44.976949, -93.271468))
            .add(LatLng(44.976931, -93.271499))
            .add(LatLng(44.976921, -93.271537))
            .add(LatLng(44.976919, -93.271553))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0807(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //Grand Hotel Minneapolis
            .add(LatLng(44.9761291, -93.2694851))
            .add(LatLng(44.9759558, -93.269052))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0808(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //JUUL
            .add(LatLng(44.9776, -93.27108))
            .add(LatLng(44.9777368, -93.2709896))
            .add(LatLng(44.977904, -93.270875))
            .add(LatLng(44.977862, -93.270784))
            .add(LatLng(44.978118, -93.270575))
            .add(LatLng(44.9778065, -93.2699))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0809(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //Grand hotel minneapolis
            .add(LatLng(44.9763262, -93.2687981))
            .add(LatLng(44.9761028, -93.2689581))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0810(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //JUUL
            .add(LatLng(44.9772654, -93.271485))
            .add(LatLng(44.977405, -93.2713579))
            .add(LatLng(44.9774426, -93.2713223))
            .add(LatLng(44.977467, -93.271292))
            .add(LatLng(44.977481, -93.271258))
            .add(LatLng(44.977486, -93.271226))
            .add(LatLng(44.977484, -93.271197))
            .add(LatLng(44.977477, -93.27117))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0811(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //CROWN PLAZA
            .add(LatLng(44.976286, -93.26811))
            .add(LatLng(44.97665, -93.267944))
            .add(LatLng(44.9765352, -93.2676654))
            .add(LatLng(44.976765, -93.26747))
            .add(LatLng(44.976845, -93.267559))
            .add(LatLng(44.977108, -93.267586))
            .add(LatLng(44.977214, -93.26779))
            .add(LatLng(44.977048, -93.267919))
            .add(LatLng(44.9771099, -93.2681365))
            .add(LatLng(44.977307, -93.268606))
            .add(LatLng(44.9772502, -93.2687121))
            .add(LatLng(44.9772106, -93.2688182))
            .add(LatLng(44.97719, -93.268907))
            .add(LatLng(44.977185, -93.2689849))
            .add(LatLng(44.977194, -93.269066))
            .add(LatLng(44.9773862, -93.2696154))
            .add(LatLng(44.977247, -93.2697404))
            .add(LatLng(44.9770329, -93.2698828))
            .add(LatLng(44.976752, -93.270073))
            .add(LatLng(44.976545, -93.270239))
            .add(LatLng(44.976459, -93.270063))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0812(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //CITY CENTER
            .add(LatLng(44.978569, -93.272652))
            .add(LatLng(44.9788548, -93.2723948))
            .add(LatLng(44.978877, -93.272182))
            .add(LatLng(44.9788427, -93.2721141))
            .add(LatLng(44.978637, -93.272052))
            .add(LatLng(44.9784902, -93.2717302))
            .add(LatLng(44.977712, -93.272351))
            .add(LatLng(44.977593, -93.272314))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0813(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //JUUL
            .add(LatLng(44.97727, -93.271202))
            .add(LatLng(44.977373, -93.271124))
            .add(LatLng(44.977397, -93.271113))
            .add(LatLng(44.977427, -93.271115))
            .add(LatLng(44.977459, -93.271139))
            .add(LatLng(44.977477, -93.27117))
            .add(LatLng(44.977505, -93.271127))
            .add(LatLng(44.9776, -93.27108))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0814(): PolylineOptions {
        return PolylineOptions() //BLACK
            .color(Color.parseColor("#5050ea")) //HOSPITAL
            .add(LatLng(44.974319, -93.26252))
            .add(LatLng(44.974003, -93.262752))
            .add(LatLng(44.973786, -93.262252))
            .add(LatLng(44.973582, -93.262401))
            .add(LatLng(44.973212, -93.261549))
            .add(LatLng(44.972943, -93.26179))
            .add(LatLng(44.972883, -93.261651))
            .add(LatLng(44.97214, -93.26227))
            .add(LatLng(44.971786, -93.261386))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0900(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //Ramp A
            .add(LatLng(44.979576, -93.277512))
            .add(LatLng(44.980465, -93.278473))
            .add(LatLng(44.980812, -93.277824))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0901(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //raddison blu
            .add(LatLng(44.976732, -93.272857))
            .add(LatLng(44.977143, -93.273806))
            .add(LatLng(44.977134, -93.273873))
            .add(LatLng(44.976753, -93.274179))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0902(): PolylineOptions {
        return PolylineOptions()
            .color(Color.parseColor("#5050ea")) //Raddisson blu
            .add(LatLng(44.9772, -93.273415))
            .add(LatLng(44.977143, -93.273806))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0903(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //raddisson blu
            .add(LatLng(44.976753, -93.274179))
            .add(LatLng(44.976357, -93.273253))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0904(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //raddisson blu
            .add(LatLng(44.9765545, -93.2730021))
            .add(LatLng(44.976771, -93.272826))
            .add(LatLng(44.977013, -93.272751))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0905(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //Ameriprise HQ
            .add(LatLng(44.975079, -93.26944))
            .add(LatLng(44.975151, -93.269402))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0906(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //raddisson blu
            .add(LatLng(44.977429, -93.273065))
            .add(LatLng(44.9772, -93.273415))
            .add(LatLng(44.977127, -93.273316))
            .add(LatLng(44.976962, -93.273389))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0909(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //baker center
            .add(LatLng(44.975328, -93.2709))
            .add(LatLng(44.975163, -93.270501))
            .add(LatLng(44.9753319, -93.270361))
            .add(LatLng(44.975434, -93.270271))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0910(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //ameriprise financial headquarters
            .add(LatLng(44.9752354, -93.2695976))
            .add(LatLng(44.975425, -93.269435))
            .add(LatLng(44.975438, -93.269268))
            .add(LatLng(44.975361, -93.269089)) //possibly unnecessary
            .add(LatLng(44.975191, -93.268725))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0911(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //IDS CENTER
            .add(LatLng(44.976369, -93.271899))
            .add(LatLng(44.976088, -93.271521))
            .add(LatLng(44.97576, -93.270703))
            .add(LatLng(44.975854, -93.270621))
            .add(LatLng(44.975656, -93.270167))
            .add(LatLng(44.975453, -93.270332))
            .add(LatLng(44.975372, -93.270018))
            .add(LatLng(44.97521, -93.269617))
            .add(LatLng(44.9752354, -93.2695976))
            .add(LatLng(44.974901, -93.268832))
            .add(LatLng(44.975109, -93.268661))
            .add(LatLng(44.975191, -93.268725))
            .add(LatLng(44.9753683, -93.2682737))
            .add(LatLng(44.975702, -93.268002))
            .add(LatLng(44.975792, -93.268154))
            .add(LatLng(44.975856, -93.268099))
            .add(LatLng(44.97588, -93.268137))
            .add(LatLng(44.97592, -93.268177))
            .add(LatLng(44.975979, -93.268207))
            .add(LatLng(44.976042, -93.268209))
            .add(LatLng(44.976102, -93.268183))
            .add(LatLng(44.976156, -93.268128))
            .add(LatLng(44.976286, -93.26811))
            .add(LatLng(44.97628, -93.268394))
            .add(LatLng(44.97633, -93.268799))
            .add(LatLng(44.976603, -93.269516))
            .add(LatLng(44.976334, -93.269748))
            .add(LatLng(44.976459, -93.270063))
            .add(LatLng(44.975854, -93.270621))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0912(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //raddison blu
            .add(LatLng(44.977013, -93.272751))
            .add(LatLng(44.977261, -93.272652))
            .add(LatLng(44.977593, -93.272314))
            .add(LatLng(44.9772654, -93.271485))
            .add(LatLng(44.9771, -93.271629))
            .add(LatLng(44.9770398, -93.2716753))
            .add(LatLng(44.977008, -93.271676))
            .add(LatLng(44.976975, -93.271669))
            .add(LatLng(44.976946, -93.271645))
            .add(LatLng(44.976925, -93.2716))
            .add(LatLng(44.976919, -93.271553))
            .add(LatLng(44.976369, -93.271899))
            .add(LatLng(44.976251, -93.27227))
            .add(LatLng(44.976514, -93.272902))
            .add(LatLng(44.976511, -93.273037))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea0914(): PolylineOptions {
        return PolylineOptions() //CYAN
            .color(Color.parseColor("#5050ea")) //AMERIPRISE FINANCIAL
            .add(LatLng(44.9749, -93.268831))
            .add(LatLng(44.9746823, -93.2683216))
            .add(LatLng(44.9746367, -93.2683558))
            .add(LatLng(44.974466, -93.267937))
            .add(LatLng(44.974356, -93.268022))
            .add(LatLng(44.9743256, -93.2679621))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea1002(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //DQ
            .add(LatLng(44.97622, -93.274292))
            .add(LatLng(44.9761358, -93.2741039))
            .add(LatLng(44.9759916, -93.2742321))
            .add(LatLng(44.9760668, -93.2744043))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea1004(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //DQ
            .add(LatLng(44.9758175, -93.2735978))
            .add(LatLng(44.975904, -93.273814))
            .add(LatLng(44.975509, -93.27414))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1005(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //RSM
            .add(LatLng(44.974831, -93.273132))
            .add(LatLng(44.974731, -93.272903))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1006(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //Foshay
            .add(LatLng(44.974701, -93.272041))
            .add(LatLng(44.9744106, -93.2713542))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1007(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //RSM
            .add(LatLng(44.975269, -93.27243))
            .add(LatLng(44.97514, -93.27211))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1008(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //RSM
            .add(LatLng(44.975456, -93.27227))
            .add(LatLng(44.975513, -93.272415))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1009(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //RSM
            .add(LatLng(44.975552, -93.27314))
            .add(LatLng(44.975269, -93.27243))
            .add(LatLng(44.9761504, -93.2716049))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1010(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //DQ
            .add(LatLng(44.9765545, -93.2730021))
            .add(LatLng(44.976511, -93.273037))
            .add(LatLng(44.976508, -93.273114))
            .add(LatLng(44.976357, -93.273253))
            .add(LatLng(44.9761422, -93.2733353))
            .add(LatLng(44.9758913, -93.2735182))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1012(): PolylineOptions {
        return PolylineOptions() //MAGENTA
            .color(Color.parseColor("#5050ea")) //FOSHAY
            .add(LatLng(44.9745269, -93.2712427))
            .add(LatLng(44.9743746, -93.2709003))
            .add(LatLng(44.9742299, -93.2706227))
            .add(LatLng(44.974023, -93.2701584))
            .add(LatLng(44.9738794, -93.2698552))
            .add(LatLng(44.9737479, -93.2695577))
            .add(LatLng(44.9736179, -93.2692627))
            .add(LatLng(44.9739119, -93.2690107))
            .add(LatLng(44.9738357, -93.2688397))
            .add(LatLng(44.9738919, -93.2687877))
            .add(LatLng(44.9737369, -93.2684327))
            .add(LatLng(44.9743266, -93.2679607))
            .add(LatLng(44.9741499, -93.2675357))
            .add(LatLng(44.9742199, -93.2674757))
            .add(LatLng(44.9741649, -93.2673457))
            .add(LatLng(44.9740999, -93.2670177))
            .add(LatLng(44.9740149, -93.2667907))
            .add(LatLng(44.9739949, -93.2667017))
            .add(LatLng(44.9739919, -93.2666197))
            .add(LatLng(44.9739989, -93.2665557))
            .add(LatLng(44.9740179, -93.2664837))
            .add(LatLng(44.9740449, -93.2664237))
            .add(LatLng(44.9740789, -93.2663737))
            .add(LatLng(44.9741099, -93.2663417))
            .add(LatLng(44.9740949, -93.2662217))
            .add(LatLng(44.9741779, -93.2661577))
            .add(LatLng(44.9741879, -93.2661267))
            .add(LatLng(44.9744119, -93.2660587))
            .add(LatLng(44.9754279, -93.2651867))
            .add(LatLng(44.9754749, -93.2652797))
            .add(LatLng(44.9754245, -93.2653257))
            .add(LatLng(44.9757719, -93.2661407))
            .add(LatLng(44.975777, -93.266226))
            .add(LatLng(44.9758429, -93.2663717))
            .add(LatLng(44.975938, -93.266589))
            .add(LatLng(44.976166, -93.267106))
            .add(LatLng(44.976562, -93.267244))
            .add(LatLng(44.976765, -93.26747))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1100(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //orpheum theatre
            .add(LatLng(44.977219, -93.278168))
            .add(LatLng(44.976921, -93.277924))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())


    }

    fun drawArea1101(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //FAIR School
            .add(LatLng(44.975361, -93.27681))
            .add(LatLng(44.97541, -93.276619))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea1102(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //FAIR school
            .add(LatLng(44.975544, -93.276634))
            .add(LatLng(44.975479, -93.276451))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1103(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //the local
            .add(LatLng(44.9744866, -93.2733731))
            .add(LatLng(44.975071, -93.27298))
            .add(LatLng(44.975159, -93.272903))
            .add(LatLng(44.975227, -93.27285))
            .add(LatLng(44.975384, -93.272728))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1104(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //TGT STORE
            .add(LatLng(44.9758913, -93.2735182))
            .add(LatLng(44.975426, -93.273925))
            .add(LatLng(44.975509, -93.27414))
            .add(LatLng(44.9752947, -93.2742937))
            .add(LatLng(44.9750008, -93.2744299))
            .add(LatLng(44.9748167, -93.2743369))
            .add(LatLng(44.974594, -93.274508))
            .add(LatLng(44.97435, -93.273941))
            .add(LatLng(44.97464, -93.273712))
            .add(LatLng(44.9744866, -93.2733731))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1105(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //FAIR SCHOOL
            .add(LatLng(44.976641, -93.273929))
            .add(LatLng(44.975968, -93.274496))
            .add(LatLng(44.976049, -93.274672))
            .add(LatLng(44.97597, -93.274736))
            .add(LatLng(44.976083, -93.275133))
            .add(LatLng(44.9762569, -93.2755414))
            .add(LatLng(44.975788, -93.275948))
            .add(LatLng(44.975861, -93.276123))
            .add(LatLng(44.975449, -93.276466))
            .add(LatLng(44.97541, -93.276619))
            .add(LatLng(44.97514, -93.275932))
            .add(LatLng(44.974911, -93.275597))
            .add(LatLng(44.97466, -93.275811))
            .add(LatLng(44.974239, -93.274805))
            .add(LatLng(44.974594, -93.274508))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1106(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //GREYHOUND BUS STATION
            .add(LatLng(44.978043, -93.277527))
            .add(LatLng(44.977722, -93.27758))
            .add(LatLng(44.97744, -93.277802))
            .add(LatLng(44.977219, -93.278168))
            .add(LatLng(44.977108, -93.278564))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1108(): PolylineOptions {
        return PolylineOptions() //BLUE
            .color(Color.parseColor("#5050ea")) //oracle
            .add(LatLng(44.973828, -93.271848))
            .add(LatLng(44.9740097, -93.272263))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1200(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //Univ St Thomas
            .add(LatLng(44.975212, -93.276138))
            .add(LatLng(44.974632, -93.276634))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1201(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //TARGETHQ
            .add(LatLng(44.9743352, -93.2750347))
            .add(LatLng(44.9740392, -93.2752428))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1204(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //Hilton Minneapolis
            .add(LatLng(44.972258, -93.2731188))
            .add(LatLng(44.9723932, -93.2734282))
            .add(LatLng(44.9726557, -93.2732084))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1205(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //hilton minneapolis
            .add(LatLng(44.9728832, -93.272717))
            .add(LatLng(44.972921, -93.272824))
            .add(LatLng(44.972895, -93.272954))
            .add(LatLng(44.972948, -93.273083))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1206(): PolylineOptions {
        return PolylineOptions() //GREEN
            .color(Color.parseColor("#5050ea")) //HILTON MINNEAPOLIS
            .add(LatLng(44.9758414, -93.2709086))
            .add(LatLng(44.97546, -93.271225))
            .add(LatLng(44.975328, -93.2709))
            .add(LatLng(44.9748714, -93.271313))
            .add(LatLng(44.9747586, -93.2710518))
            .add(LatLng(44.973828, -93.271848))
            .add(LatLng(44.973775, -93.271719))
            .add(LatLng(44.973585, -93.271849))
            .add(LatLng(44.973572, -93.271969))
            .add(LatLng(44.973269, -93.272202))
            .add(LatLng(44.973256, -93.272313))
            .add(LatLng(44.9729477, -93.2726538))
            .add(LatLng(44.9728832, -93.272717))
            .add(LatLng(44.972809, -93.272555))
            .add(LatLng(44.972651, -93.272472))
            .add(LatLng(44.97251, -93.272583))
            .add(LatLng(44.972271, -93.27198))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1300(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //st thomas Law
            .add(LatLng(44.9743398, -93.2786413))
            .add(LatLng(44.9740157, -93.2783849))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1301(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //bolero flats
            .add(LatLng(44.972351, -93.2746189))
            .add(LatLng(44.9721277, -93.2740874))
            .add(LatLng(44.971809, -93.274368))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1302(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //hotel ivy
            .add(LatLng(44.9717426, -93.2731398))
            .add(LatLng(44.9715844, -93.2727427))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1303(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //bolero flats
            .add(LatLng(44.9719384, -93.2733961))
            .add(LatLng(44.9721673, -93.2739465))
            .add(LatLng(44.9721277, -93.2740874))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1304(): PolylineOptions {
        return PolylineOptions() //YELLOW
            .color(Color.parseColor("#5050ea")) //ST THOM LAW
            .add(LatLng(44.9740157, -93.2783849))
            .add(LatLng(44.9741874, -93.277916))
            .add(LatLng(44.974731, -93.276932))
            .add(LatLng(44.974632, -93.276634))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())
    }

    fun drawArea1401(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //hyatt regency
            .add(LatLng(44.971142, -93.277583))
            .add(LatLng(44.970352, -93.278275))
            .add(LatLng(44.970737, -93.279213))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1402(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //Marquette Place
            .add(LatLng(44.970909, -93.277031))
            .add(LatLng(44.97031, -93.27755))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1403(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //marquette place
            .add(LatLng(44.9708126, -93.27679))
            .add(LatLng(44.971077, -93.276573))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

    fun drawArea1404(): PolylineOptions {
        return PolylineOptions() //RED
            .color(Color.parseColor("#5050ea")) //CONVENTION CENTER
            .add(LatLng(44.97251, -93.272583))
            .add(LatLng(44.9721543, -93.2728694))
            .add(LatLng(44.972258, -93.2731188))
            .add(LatLng(44.9719384, -93.2733961))
            .add(LatLng(44.9718024, -93.2730926))
            .add(LatLng(44.971138, -93.273615))
            .add(LatLng(44.9708935, -93.2730433))
            .add(LatLng(44.9707688, -93.2729919))
            .add(LatLng(44.9704948, -93.2732026))
            .add(LatLng(44.970039, -93.273571))
            .add(LatLng(44.969868, -93.273581))
            .add(LatLng(44.969551, -93.273842))
            .add(LatLng(44.969559, -93.275574))
            .add(LatLng(44.970079, -93.275587))
            .add(LatLng(44.970272, -93.276083))
            .add(LatLng(44.970351, -93.276018))
            .add(LatLng(44.970436, -93.276046))
            .add(LatLng(44.970601, -93.276407))
            .add(LatLng(44.970667, -93.276444))
            .add(LatLng(44.971142, -93.277583))
            .jointType(JointType.ROUND)
            .startCap(RoundCap())
            .endCap(RoundCap())

    }

}