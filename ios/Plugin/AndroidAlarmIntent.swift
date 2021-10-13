import Foundation

@objc public class AndroidAlarmIntent: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
