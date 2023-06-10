package dev.aaa1115910.biliapi.entity.video.season

data class Section(
    val id: Int,
    val title: String,
    val episodes: List<Episode>
) {
    companion object {
        fun fromSection(section: dev.aaa1115910.biliapi.http.entity.video.UgcSeason.Section) =
            Section(
                id = section.id,
                title = section.title,
                episodes = section.episodes.map { Episode.fromEpisode(it) }
            )

        fun fromSection(section: bilibili.app.view.v1.Section) = Section(
            id = section.id.toInt(),
            title = section.title,
            episodes = section.episodesList.map { Episode.fromEpisode(it) }
        )
    }
}
