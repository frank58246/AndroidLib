package frank.li.utility.extension

import android.content.Context
import android.widget.Toast

class ContextExtensoin {

    fun Context.showShortToast(content: String) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show()
    }

    fun Context.showLongToast(content: String) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show()
    }
}
