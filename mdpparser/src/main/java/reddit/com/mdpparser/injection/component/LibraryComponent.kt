package reddit.com.mdpparser.injection.component

import dagger.Component
import reddit.com.mdpparser.core.external.ManifestLocalizer
import javax.inject.Singleton

@Singleton
@Component()
interface LibraryComponent {

    fun inject(external: ManifestLocalizer)

}