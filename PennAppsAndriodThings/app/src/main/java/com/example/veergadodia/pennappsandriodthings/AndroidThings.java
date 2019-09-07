class Buttons(private val buttonDrivers: List<ButtonInputDriver> = listOf(
        registerButtonDriver(Buttons.BUTTON_A_GPIO_PIN, KeyEvent.KEYCODE_A),
        registerButtonDriver(Buttons.BUTTON_B_GPIO_PIN, KeyEvent.KEYCODE_B),
        registerButtonDriver(Buttons.BUTTON_C_GPIO_PIN, KeyEvent.KEYCODE_C))) : Closeable {

    companion object {

        val BUTTON_A_GPIO_PIN = "BCM21"
        val BUTTON_B_GPIO_PIN = "BCM20"
        val BUTTON_C_GPIO_PIN = "BCM16"

        private fun registerButtonDriver(pin: String, keycode: Int): ButtonInputDriver {
            val driver = ButtonInputDriver(pin, Button.LogicState.PRESSED_WHEN_LOW, keycode)
            driver.register()
            return driver
        }
    }

    override fun close() {
        buttonDrivers.forEach(ButtonInputDriver::closed
    }
}