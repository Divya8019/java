public class MusicStreamingApp {
    public static void main(String[] args) {
        MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicSource streaming = new OnlineStreamingAdapter("https://streaming.service.com/song");
        MusicSource radio = new RadioStationAdapter("101.1 FM");

        // Play local file with equalizer and volume control
        MusicSource enhancedLocalFile = new VolumeControlDecorator(new EqualizerDecorator(localFile));
        enhancedLocalFile.play();

        System.out.println();

        // Play online streaming with volume control
        MusicSource enhancedStreaming = new VolumeControlDecorator(streaming);
        enhancedStreaming.play();

        System.out.println();

        // Play radio station with equalizer
        MusicSource enhancedRadio = new EqualizerDecorator(radio);
        enhancedRadio.play();
    }
}

