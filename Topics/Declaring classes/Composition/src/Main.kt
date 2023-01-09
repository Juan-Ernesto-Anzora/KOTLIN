class OperatingSystem(var name: String = "")

class DualBoot(var primaryOs: OperatingSystem = OperatingSystem("MacOS"), var secondaryOs: OperatingSystem = OperatingSystem("Linux"))