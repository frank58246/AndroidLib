package frank.li.utility.extension

import android.content.Context
import android.widget.Toast

open class ContextExtensoin {

    open fun Context.showShortToast(content: String) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show()
    }

    open fun Context.showLongToast(content: String) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show()
    }
}
