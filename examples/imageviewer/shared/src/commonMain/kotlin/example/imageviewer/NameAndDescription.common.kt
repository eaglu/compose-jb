package example.imageviewer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import kotlinx.datetime.*

class NameAndDescription(
    val name: String,
    val description: String,
)

@Composable
internal fun createNewPhotoNameAndDescription(): NameAndDescription {
    val localization = LocalLocalization.current
    return remember {

        Clock.System.now().toLocalDateTime(TimeZone.UTC)
        val kotlinConfEndTime =
            LocalDateTime(2023, Month.APRIL, 14, hour = 23, minute = 59).toInstant(TimeZone.UTC)

        if (Clock.System.now() < kotlinConfEndTime) {
            NameAndDescription(
                localization.kotlinConfName,
                localization.kotlinConfDescription
            )
        } else {
            NameAndDescription(
                localization.newPhotoName,
                localization.newPhotoDescription
            )
        }
    }
}
