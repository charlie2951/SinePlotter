package com.github.charlie2951.viewgraph
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlin.math.sin

class GraphActivity : AppCompatActivity() {

    // on below line we are creating
    // variables for our graph view
    lateinit var lineGraphView: GraphView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph)

        // on below line we are initializing
        // our variable with their ids.
        lineGraphView = findViewById(R.id.idGraphView)

        val series: LineGraphSeries<DataPoint> =LineGraphSeries(generateData())
        /*
        // on below line we are adding data to our graph view.
        val series: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                // on below line we are adding
                // each point on our x and y axis.
                DataPoint(0.0, 1.0),
                DataPoint(1.0, 3.0),
                DataPoint(2.0, 4.0),
                DataPoint(3.0, 9.0),
                DataPoint(4.0, 6.0),
                DataPoint(5.0, 3.0),
                DataPoint(6.0, 6.0),
                DataPoint(7.0, 1.0),
                DataPoint(8.0, 2.0)
            )
        )

         */




        // on below line adding animation
        lineGraphView.animate()

        // on below line we are setting scrollable
        // for point graph view
        lineGraphView.viewport.isScrollable = true

        // on below line we are setting scalable.
        lineGraphView.viewport.isScalable = true

        // on below line we are setting scalable y
        lineGraphView.viewport.setScalableY(true)

        // on below line we are setting scrollable y
        lineGraphView.viewport.setScrollableY(true)

        // on below line we are customixing graph and axis
        lineGraphView.getViewport().setYAxisBoundsManual(true); // Prevents auto-rescaling the Y-axis
        lineGraphView.getViewport().setXAxisBoundsManual(true); // Prevents auto-rescaling the X-axis
        lineGraphView.setTitleTextSize(48F);
        lineGraphView.setTitle("Sine Wave Display");
        lineGraphView.getGridLabelRenderer().setHumanRounding(true);
        lineGraphView.getGridLabelRenderer().setVerticalAxisTitleTextSize(32F);
        lineGraphView.getGridLabelRenderer().setVerticalAxisTitle("Amplitude");
        lineGraphView.getGridLabelRenderer().setHorizontalAxisTitleTextSize(32F);
        lineGraphView.getGridLabelRenderer().setHorizontalAxisTitle("Time Scale");
        lineGraphView.getGridLabelRenderer().setHorizontalLabelsVisible(true);

        // on below line we are adding
        // data series to our graph view.
        lineGraphView.addSeries(series)
    }
    private fun generateData(): Array<DataPoint?> {
        var i=0
        val values = arrayOfNulls<DataPoint>(100)
        while(i<100){
            val y: Double = sin(2*i*Math.PI/50)
            val x: Double = i.toDouble()/50
            val v = DataPoint(x, y)
            values[i] = v
            i+=1
        }
        return values
    }


    /*
    private fun generateData(): Array<DataPoint?> {
        val per = 2*Math.PI
        val steps=100
        var t:Double = 0.0;
        val freq = 100*Math.PI
        val w = 2*Math.PI*freq
        val A = 5
        val values = arrayOfNulls<DataPoint>(steps)
        var i=0
        while(t<= per) {
            t= (t + per/steps)
            val y: Double = A * sin(w*t)
            val x: Double = t
            val v = DataPoint(x, y)
            values[i] = v
            i += 1
        }
        /*
        for (i in 0 until count.toInt()) {
            val x = i.toDouble()
            val f: Double = mRand.nextDouble() * 0.15 + 0.3
            val y: Double = Math.sin(2*Math.PI*100) + mRand.nextDouble() * 0.3
            val v = DataPoint(x, y)
            values[i] = v
        }

         */
        return values
    }

     */
}
