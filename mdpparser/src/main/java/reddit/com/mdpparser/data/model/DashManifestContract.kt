package reddit.com.mdpparser.data.model


interface DashManifest {

    val periodCount: Int

    fun getPeriod(index: Int): Period?

    fun getMinBufferTime(): Long

    fun getProfiles(): String?

    fun getXmlns(): String?
}

interface Period {

    var adaptationSets: List<AdaptationSet>?

    fun getDuration(): String
}

interface AdaptationSet {

    val mimeType: String
    val representations: List<Representation>?
    val segmentAlignment: Boolean
    val subsegmentAlignment: Boolean
    val subsegmentStartsWithSAP: Int
}

interface Representation {
    val id: String
    val bandwidth: Long
    val width: Int
    val height: Int
    val format: Format
    val baseUrl: String
    val segmentTemplate: SegmentTemplate?
}

interface SegmentList {
    val timescale: Long
    val duration: Long
    val representationIndex: RepresentationIndex
    val segmentURLs: List<SegmentURL>
}

interface SegmentURL {
    val media: String
}

interface SegmentTemplate {
    val media: String
    val timescale: Long
    val representationIndex: RepresentationIndex
    val segmentTimeline: SegmentTimeline
}

interface S {
    val t: Int
    val r: Int
    val d: Long
}

interface SegmentTimeline {
    val s: List<S>
}


interface RepresentationIndex {
    val sourceURL: String
}

interface Initialization

interface SegmentBase {
    val indexRange: String
    val indexRangeExact: Boolean
    val initialization: Initialization
    val representationIndex: RepresentationIndex?
}

interface Format {
    val containerMimeType: String
}