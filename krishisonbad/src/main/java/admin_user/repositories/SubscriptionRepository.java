package admin_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import admin_user.model.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
