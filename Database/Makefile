# Makefile

DC_COMP_DEV:= docker-compose.yml

db-up:
	docker-compose -f $(DC_COMP_DEV) up -d

db-down:
	docker-compose -f $(DC_COMP_DEV) down

db-logs:
	docker-compose -f $(DC_COMP_DEV) logs -f

db-build:
	docker-compose -f $(DC_COMP_DEV) build

db-clean-volumes:
	docker-compose -f $(DC_COMP_DEV) down -v

db-reset: db-clean-volumes db-up

db-psql:
	docker-compose -f $(DC_COMP_DEV) exec postgres psql -U medley medley