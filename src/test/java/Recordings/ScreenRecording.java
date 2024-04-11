package Recordings;

import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import org.monte.media.Format;
import org.monte.media.math.Rational;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class ScreenRecording {
    private ScreenRecorder screenRecorder;

    public void startRecording(String PlatformName) throws Exception
    {
        File file =new File("./Videos");
        int width=364;
        int height=848;
        Rectangle captureSize=new Rectangle(0,0,width,height);

        GraphicsConfiguration gc = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .getDefaultConfiguration();

        this.screenRecorder = new SpecializedScreenRecorder(gc, captureSize,
                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                        QualityKey, 1.0f,
                        KeyFrameIntervalKey, 15 * 60),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                        FrameRateKey, Rational.valueOf(30)),
                null, file, PlatformName);
        this.screenRecorder.start();

    }

    public void stopRecording() throws Exception
    {
        this.screenRecorder.stop();
    }
}
