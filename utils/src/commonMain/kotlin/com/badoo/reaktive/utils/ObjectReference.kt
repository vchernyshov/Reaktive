package com.badoo.reaktive.utils

/**
 * A simple mutable reference holder for cases when atomic semantics are not required.
 * In JVM and JS it's just a variable.
 * In Native it's backed by FreezableAtomicReference so the reference can be updated from different threads.
 * Useful when concurrent access is already somehow synchronized and all you need is mutability.
 */
expect open class ObjectReference<T>(initialValue: T) {

    var value: T
}
